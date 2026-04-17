/*Crie uma classe chamada Funcionario que inclui três
informações como atributos: o primeiro nome, o
sobrenome e o salário mensal de um funcionário
(valor decimal maior ou igual que 0 e menor que
20000).
Sua classe deverá ter um construtor que inicializa
esses três valores. Para valores default, considere o
nome e o sobrenome como textos vazios e o salário
como 0.
Escreva métodos Getters e Setters para as variáveis
que precisam ser protegidas pelo encapsulamento. Por
exemplo, se um salário tentar ser alterado de modo
inválido de acordo com a regra do negócio, o atributo
deve ser mantido inalterado. */

public class Funcionario{

    private String nome;
    private String sobrenome;
    private double salarioMensal = 0;

    public Funcionario (String nome, String sobrenome, double salarioMensal) {

        if (nome != null) {
            this.nome = nome;
        } else {
            this.nome = "";
        }
        if (sobrenome != null) {
            this.sobrenome = sobrenome;
        } else {
            this.sobrenome = "";
        }
        if (salarioMensal >= 0 && salarioMensal < 20000) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0;
        }
    }

        public String getNome() {
            return nome;
        }
        public String getSobrenome() {
            return sobrenome;
        }
        public double getSalarioMensal() {
            return salarioMensal;
        }
        public void setNome(String nome){
            if (nome != null) {
                this.nome = nome;
            } else {
                this.nome = "";
            }
        }

        public void setSobrenome(String sobrenome){
            if (sobrenome != null) {
                this.sobrenome = sobrenome;
        } else{
            this.sobrenome = "";
        }
    }


        public void setSalarioMensal(double salarioMensal) {
            if (salarioMensal >= 0 && salarioMensal < 20000) {
                this.salarioMensal = salarioMensal;
            }

        }
}

