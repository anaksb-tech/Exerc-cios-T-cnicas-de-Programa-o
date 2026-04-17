public class Main {
    public static void main(String[] args) {
        Juros js = new JurosSimples(2000.0, 0.03, 3);
        Juros jc = new JurosCompostos(2000.0, 0.03, 3);

        System.out.printf("Juros Simples: R$ %.2f\n", js.calcularJuros());
        System.out.printf("Juros Compostos: R$ %.2f\n", jc.calcularJuros());
    }
}
