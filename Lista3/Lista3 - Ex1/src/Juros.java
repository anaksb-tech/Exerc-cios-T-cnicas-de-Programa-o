public abstract class Juros {
    protected double capital;
    protected double taxa;
    protected int tempo;

    public Juros(double capital, double taxa, int tempo) {
        setCapital(capital);
        setTaxa(taxa);
        setTempo(tempo);
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        if (capital > 0) {
            this.capital = capital;
        }
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if (taxa >= 0 && taxa <= 1) {
            this.taxa = taxa;
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        if (tempo >= 0) {
            this.tempo = tempo;
        }
    }

    public abstract double calcularJuros();
}
