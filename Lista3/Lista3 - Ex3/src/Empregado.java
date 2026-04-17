public class Empregado extends MembroDaComunidade{
    protected String codigo;
    protected String cargo;
    protected double salario;

    public Empregado(int cpf, String nome, String email, String codigo, String cargo, double salario ){
        super(cpf, nome, email);
        this.codigo = codigo;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCodigo: " + codigo + ", Cargo: " + cargo + ", Salario: " + salario;
    }
}
