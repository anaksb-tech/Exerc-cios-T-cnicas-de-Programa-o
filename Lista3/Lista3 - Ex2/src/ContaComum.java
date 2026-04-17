public class ContaComum {
    protected String numConta;
    protected String titular;
    protected double saldo;

    public ContaComum(String numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }


    public String getNumConta(){
        return numConta;
 }
    public double getSaldo(){
        return saldo;
 }
    public String getTitular(){
        return titular;
 }

    public boolean abertura(){
     this.saldo = 0.0;
     return true;
}
    public boolean abertura(double valor){
     if(valor > 0){
        this.saldo = valor;
        return true;
     } else {
        return false;
    }
}
   public boolean deposito(double valor){
     if(valor > 0){
      this.saldo += valor;
      return true;
} else{
      return false;
    }
}

    public boolean saque(double valor){
    if(valor > 0 && valor <= saldo){
        this.saldo -= valor;
        return true;
    } else {
        return false;
    }
}

     public double saldo(){
       return this.saldo;
   }
}