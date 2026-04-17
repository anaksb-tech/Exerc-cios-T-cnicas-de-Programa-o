public class JurosCompostos extends Juros {

    public JurosCompostos(double capital, double taxa, int tempo) {
        super(capital, taxa, tempo);
    }
    @Override
    public double calcularJuros() {
        return capital * Math.pow(1 + taxa, tempo) - capital;
    }
}