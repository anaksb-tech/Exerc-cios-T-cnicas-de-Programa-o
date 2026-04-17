public class MembroDaComunidade {
    protected int cpf;
    protected String nome;
    protected String email;

 public MembroDaComunidade (int cpf, String nome, String email){
    this.cpf = cpf;
    this.nome = nome;
    this.email = email;
 }

 @Override
public String toString(){
    return "CPF: " + cpf + "\nNome: " + nome + "\nEmail: " + email;
 }
}