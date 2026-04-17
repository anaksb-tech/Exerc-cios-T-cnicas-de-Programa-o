/* No seu programa principal (classe Main), teste sua
classe Funcionario. Crie duas instâncias de Funcionario
e exiba no Console seus nomes e salários. Depois
disso, aplique um aumento de 20% em seus salários e
novamente faça a exibição no Console.*/

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Ana", "Santos", 15900);
        Funcionario funcionario2 = new Funcionario("Thomas", "Costa", 7800);

        System.out.printf("Funcionário: %s %s , Salario: R$ %.3f \n", funcionario1.getNome(), funcionario1.getSobrenome(), funcionario1.getSalarioMensal());
        System.out.printf("Funcionário: %s %s , Salario: R$ %.3f \n", funcionario2.getNome(), funcionario2.getSobrenome(), funcionario2.getSalarioMensal());


        /* Testando o setter*/
        funcionario1.setSalarioMensal(25000);
        System.out.printf("\nSalário após tentativa inválida (Salário maior que 20000): R$ %.2f", funcionario1.getSalarioMensal());

        funcionario2.setSalarioMensal(-1000);
        System.out.printf("\nSalário após tentativa inválida (Salário negativo): R$ %.2f\n", funcionario2.getSalarioMensal());

        double novoSalario1 = funcionario1.getSalarioMensal() * 1.2;
        if (novoSalario1 < 20000) {
            funcionario1.setSalarioMensal(novoSalario1);
        } else {
            System.out.println("Aumento ultrapassaria o limite permitido para " + funcionario1.getNome());
        }

        double novoSalario2 = funcionario2.getSalarioMensal() * 1.2;
        if (novoSalario2 < 20000) {
            funcionario2.setSalarioMensal(novoSalario2);
        } else {
            System.out.println("Aumento ultrapassaria o limite permitido para " + funcionario2.getNome());
        }


        System.out.println("\nAumento de 20% feito!");
        System.out.printf("Funcionário: %s %s , Salario novo: R$ %.3f\n", funcionario1.getNome(), funcionario1.getSobrenome(), funcionario1.getSalarioMensal());
        System.out.printf("Funcionário: %s %s , Salario novo: R$ %.3f\n", funcionario2.getNome(), funcionario2.getSobrenome(), funcionario2.getSalarioMensal());
    }
}


