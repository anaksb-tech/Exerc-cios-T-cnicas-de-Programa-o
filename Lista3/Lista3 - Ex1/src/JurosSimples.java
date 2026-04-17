public class JurosSimples extends Juros{

        public JurosSimples(double capital, double taxa, int tempo) {
            super(capital, taxa, tempo);
        }

    @Override
    public double calcularJuros() {
        return capital * taxa * tempo;
    }
}

