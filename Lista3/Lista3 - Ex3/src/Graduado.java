public class Graduado extends MembroDaComunidade {
    protected String cursoGraduado;
    protected int anoConclusao;
    protected String grauObtido;

    public Graduado(int cpf, String nome, String email, String cursoGraduado, int anoConclusao, String grauObtido) {
        super(cpf, nome, email);
        this.cursoGraduado = cursoGraduado;
        this.anoConclusao = anoConclusao;
        this.grauObtido = grauObtido;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurso Graduado: " + cursoGraduado +
                ", Ano de Conclusão: " + anoConclusao + ", Grau Obtido (Ex: Bacharelado): " + grauObtido;
    }
}
