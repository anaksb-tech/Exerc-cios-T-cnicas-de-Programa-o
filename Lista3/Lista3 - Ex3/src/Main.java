public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1111111, "Saimo", "Saimoo@email.com", "22222222222", 9.0, "Sistemas de Informação");
        Graduado graduado = new Graduado(222222, "Laura", "laura@email.com", "Sistemas de Informação", 2018, "Bacharelado");

        Funcionarios funcionario = new Funcionarios(333333,"Robério", "roberinho@email.com", "Assistente", "Administração", 1412.0,
                "Atendimento", "Integral", false);

    Administrador administrador = new Administrador(444444, "Laufey", "laufey@email.com", "Ab5555", "Programadora", 3000.0,
                "Tecnologia", 40, "Superior",
                "Infraestrutura", 3, "Diurno");

        Professor professor = new Professor(66666, "TaylorSwift", "taylorswift@email.com", "Ab7777", "Educação", 1412.0,
                "Ciencias da Natureza", 40, "Superior",
                "Educação", 12, "Noturno", "Biologia", "Unirio", "Formiga");

        System.out.println("\n- Aluno -\n" + aluno);
        System.out.println("\n- Graduado -\n" + graduado);
        System.out.println("\n- Funcionário -\n" + funcionario);
        System.out.println("\n- Administrador -\n" + administrador);
        System.out.println("\n- Professor -\n" + professor);
    }
}
