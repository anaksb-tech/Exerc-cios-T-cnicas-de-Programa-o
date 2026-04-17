public class Aluno extends MembroDaComunidade{
    protected String matricula;
    protected double nota;
    protected String curso;

    public Aluno(int cpf, String nome, String email, String matricula, double nota, String curso){
        super(cpf, nome, email);
        this.matricula = matricula;
        this.nota = nota;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatricula: " + matricula +
                ", Nota: " + nota + ", Curso: " + curso;
    }
}