public class CorpoDocente extends Empregado {
    protected String areaAtuacao;
    protected int cargaHoraria;
    protected String nivelEnsino;

    public CorpoDocente(int cpf, String nome, String email, String codigo, String cargo, double salario,
                        String areaAtuacao, int cargaHoraria, String nivelEnsino) {
        super(cpf, nome, email, codigo, cargo, salario);
        this.areaAtuacao = areaAtuacao;
        this.cargaHoraria = cargaHoraria;
        this.nivelEnsino = nivelEnsino;
    }

    @Override
    public String toString() {
        return super.toString() + "\nÁrea de Atuação: " + areaAtuacao +
                ", Carga Horária: " + cargaHoraria + ", Nível de Ensino: " + nivelEnsino;
    }
}
