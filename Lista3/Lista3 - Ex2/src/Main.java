public class Main {
    public static void main(String[] args) {

        ContaComum cc = new ContaComum("001", 0.0, "Saimo");
        cc.abertura(200);
        System.out.println("Conta Comum");
        System.out.println("Titular: " + cc.getTitular());
        System.out.println("Número: " + cc.getNumConta());
        System.out.println("Saldo: R$ " + cc.getSaldo());

        cc.deposito(1000);
        System.out.println("Saldo após deposito: R$ " + cc.getSaldo());
        cc.saque(200);
        System.out.println("Saldo apos saque: R$ " + cc.getSaldo());

        ContaEspecial ce = new ContaEspecial("002", "Gabriel", 200.0, 0.02);
        ce.abertura(500);
        System.out.println("\nConta Especial");
        System.out.println("Titular: " + ce.getTitular());
        System.out.println("Número: " + ce.getNumConta());
        System.out.println("Saldo: R$ " + ce.getSaldo());

        ce.deposito(700);
        System.out.println("Saldo após depósito: R$ " + ce.getSaldo());
        ce.saque(200);
        System.out.println("Saldo após saque comum: R$ " + ce.getSaldo());
        ce.rendimento();
        System.out.println("Saldo após rendimento de 2%: R$ " + ce.getSaldo());
        ce.saque(1000, 300);
        System.out.println("Saldo após saque especial com limite: R$ " + ce.getSaldo());

        ContaPoupanca cp = new ContaPoupanca("003", "Luis", 0.0);
        cp.abertura(1000);
        System.out.println("\nConta Poupança");
        System.out.println("Titular: " + cp.getTitular());
        System.out.println("Número: " + cp.getNumConta());
        System.out.println("Saldo: R$ " + cp.getSaldo());

        cp.deposito(500);
        System.out.println("Saldo após depósito: R$ " + cp.getSaldo());
        cp.saque(300);
        System.out.println("Saldo após saque: R$ " + cp.getSaldo());
        cp.rendimento();
        System.out.println("Saldo após rendimento de 0,5%: R$ " + cp.getSaldo());

    }
}
