public class Funcionarios extends Empregado {
    protected String funcao;
    protected String jornada;
    protected boolean trabalhoRemoto;

    public Funcionarios(int cpf, String nome, String email, String cargo, String setor, double salario,
                        String funcao, String jornada, boolean trabalhoRemoto) {
        super(cpf, nome, email, cargo, setor, salario);
        this.funcao = funcao;
        this.jornada = jornada;
        this.trabalhoRemoto = trabalhoRemoto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFunção: " + funcao +
                ", Jornada: " + jornada + ", Trabalho Remoto: " +(trabalhoRemoto ? "Sim" : "Não");
    }
}
