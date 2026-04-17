public class Professor extends CorpoDocente{
    protected String disciplina;
    protected String universidadeCursada;
    protected String areaPesquisa;

    public Professor(int cpf, String nome, String email, String codigo, String cargo, double salario,
                     String areaAtuacao, int cargaHoraria, String nivelEnsino,
                     String setorAdmin, int anosExperiencia, String turno,
                     String disciplina, String universidadeCursada, String areaPesquisa) {
        super(cpf, nome, email, codigo, cargo, salario, areaAtuacao, cargaHoraria, nivelEnsino);
        this.disciplina = disciplina;
        this.universidadeCursada = universidadeCursada;
        this.areaPesquisa = areaPesquisa;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Disciplina: " + disciplina +
                ", Universidade Cursada: " + universidadeCursada + ", Area de Pesquisa: " + areaPesquisa;
    }
}

