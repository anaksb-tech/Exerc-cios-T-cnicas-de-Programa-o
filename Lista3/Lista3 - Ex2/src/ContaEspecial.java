public class ContaEspecial extends ContaComum implements Rendimento {
    private double juros;
    public ContaEspecial(String numConta, String titular, double saldo, double juros){
        super(numConta, saldo, titular);
        setJuros(juros);
    }

    public double getJuros(){
        return juros;
}
    public void setJuros(double juros){
        if(juros > 0){
            this.juros = juros;
        }
}


    @Override
    public boolean abertura() {
        this.saldo = 0.0;
        return true;
}

    public boolean saque(double valor, double limite) {
        if (valor > 0 && valor <= getSaldo() + limite) {
            this.saldo -= valor;
            return true;
        }
        return false;
}

    @Override
    public void rendimento() {
        if (juros > 0) {
            double novoSaldo = getSaldo() + getSaldo() * juros;
            this.saldo = novoSaldo;
        }
    }
}