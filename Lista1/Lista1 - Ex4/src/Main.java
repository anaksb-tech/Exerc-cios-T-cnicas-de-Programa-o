import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à calculadora de funções quadráticas!\n");
        System.out.println("Favor entre com os valores de a, b e c:\n");
// Captura dos dados de entrada
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
//Instanciação de um objeto FuncaoQuadratica
        FuncaoQuadratica objFunc = new FuncaoQuadratica(a, b, c);
        System.out.printf("O objeto função criado é %s\n", objFunc.descricao());
//Agora que o objeto foi criado, vamos chamar seus métodos
        System.out.printf("O X do vértice vale %f e o Y do vértice vale %f\n",
                objFunc.xVertice(), objFunc.yVertice());
        System.out.printf("As raízes da função valem %f e %f\n", objFunc.raiz1(), objFunc.raiz2());
        System.out.printf("A concavidade da função é %s\n", objFunc.concavidade());
    }
}