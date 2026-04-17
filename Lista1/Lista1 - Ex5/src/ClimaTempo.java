public class ClimaTempo {

        private double[] pluviosidade;
        private double[] pressao;

    public ClimaTempo() {
        this.pluviosidade = new double[7];
        this.pressao = new double[7];
    }

        public boolean setPluviosidade(double[] pl) {
            if (pl != null && pl.length == 7) {
                this.pluviosidade = pl;
                return true;
            }
            return false;
        }

        public boolean setPressao(double[] pr) {
            if (pr != null && pr.length == 7) {
                this.pressao = pr;
                return true;
            }
            return false;
        }

        public double calcularMediaPluvial()
        {
            double somaPluvial = 0;
            for (double pluviosidadeDia : pluviosidade) {
                somaPluvial += pluviosidadeDia;
            }
            double mediaPluvial = somaPluvial / 7;
            return mediaPluvial;
        }
        public double calcularMaximaPluvial()
        {
            double maximaPluvial = pluviosidade[0];
            for (int i = 1; i < pluviosidade.length; i++) {
                if (pluviosidade[i] > maximaPluvial) {
                    maximaPluvial = pluviosidade[i];
                }
            }
            return maximaPluvial;
        }
        public double calcularPressaoMinima() {
            double pressaoMinima = pressao[0];
            for (int i = 1; i < pressao.length; i++) {
                if (pressao[i] < pressaoMinima) {
                    pressaoMinima = pressao[i];
                }
            }
            return pressaoMinima;
        }
    }
