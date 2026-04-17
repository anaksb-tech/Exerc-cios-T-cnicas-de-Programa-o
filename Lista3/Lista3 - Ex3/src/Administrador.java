public class Administrador extends CorpoDocente {
    protected String setorAdmin;
    protected int anosExperiencia;
    protected String turno;

    public Administrador(int cpf, String nome, String email, String codigo, String cargo, double salario,
                         String areaAtuacao, int cargaHoraria, String nivelEnsino,
                         String setorAdmin, int anosExperiencia, String turno) {
        super(cpf, nome, email, codigo, cargo, salario, areaAtuacao, cargaHoraria, nivelEnsino);
        this.setorAdmin = setorAdmin;
        this.anosExperiencia = anosExperiencia;
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSetor Gerenciado: " + setorAdmin +
                ", Anos de Experiência: " + anosExperiencia + ", Turno: " + turno;
    }
}
