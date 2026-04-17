public class ContaPoupanca extends ContaComum implements Rendimento {

    public ContaPoupanca(String numConta, String titular, double saldo) {
        super(numConta, saldo, titular);
}

    @Override
    public boolean abertura() {
        this.saldo = 0.0;
        return true;
}

    @Override
    public boolean deposito(double valor) {
        return super.deposito(valor);
}

    @Override
    public boolean saque(double valor) {
        return super.saque(valor);
}

    @Override
    public void rendimento() {
        double taxa = 0.005;
        this.saldo += this.saldo * taxa;
    }
}
