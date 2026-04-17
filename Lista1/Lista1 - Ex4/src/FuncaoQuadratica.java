/* a) Implemente uma classe FuncaoQuadratica. Como sabemos que uma Função Quadrática é definida pelos seus três
coeficientes, adicione nesta classe três atributos reais denominados por A, B e C.
b) Determine se há necessidade de aplicar o encapsulamento em algum ou todos os
atributos da classe de acordo com a descrição dada de Função Quadrática. Se houver a
necessidade, crie os métodos Getters e Setters para o(s) atributo(s) e justifique
com um comentário no código.
c) Implemente um construtor para esta classe. Esse construtor irá receber três valores
reais (a, b e c) como parâmetros e irá atribuí-los aos atributos da classe.*/

public class FuncaoQuadratica {
   private double A;
   private double B;
   private double C;
/* Para proteger os atributos de alterações externas diretas, é necessario o encapsulamento das variáveis */

    public FuncaoQuadratica(double a, double b, double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }
/* para garantir que a recuperação de atributos internos de
uma classe seja realizada de modo íntegro(Agem como mediadores). Eles
repassam uma cópia do valor armazenado nas variáveis de instância. */

    public double getA(){
        return A;
    }
    public double getB(){
        return B;
    }
    public double getC(){
        return C;
    }

    /* para garantir que a alteração em atributos internos
privados de uma classe seja realizada de modo íntegro.*/

    public void setA(double a){
        this.A = a;
    }
    public void setB(double b){
        this.B = b;
    }
    public void setC(double c){
        this.C = c;
    }
    /* Resumindo, os getters e setters são necessários porque as variáveis são privadas.
    Eles sao necessarios para caso queiram, acessar ou modificar o valor dessas
    variáveis,façam de forma controlada.*/

    /* d) Implemente os métodos raiz1() e raiz2(). Esses métodos deverão retornar o valor de
cada raiz de um objeto FuncaoQuadratica. Você pode utilizar o método Math.sqrt()
importando a java.lang.Math.*/

    /* Aparentemente, é necesário usar Double (uma classe objeto de java ) para dizer que não existe raiz porque double não aceita null */
    public Double raiz1(){
        double delta = B * B - 4 * A * C;
        if (delta < 0) {
            return null;
        }
        return (-B + Math.sqrt(delta)) / (2 * A);
    }
    public Double raiz2(){
        double delta = B * B - 4 * A * C;
        if (delta < 0) {
            return null;
        }
        return (-B - Math.sqrt(delta)) / (2 * A);
    }
/* e) Implemente os métodos xVertice() e yVertice(). Esses métodos deverão retornar o valor
do x do vértice e y do vértice, respectivamente, de um objeto FuncaoQuadratica.*/
    public double xVertice(){
     return -(B)/ (2 * A);
    }
    public double yVertice(){
        double delta = B * B - 4 * A * C;
     return -(delta) / (4 * A);
}
/* f) Implemente o método concavidade() que retorna um texto indicando “para cima” ou
“para baixo” de acordo com o coeficiente a. */

    public String concavidade() {
        if (A > 0) {
            return "para cima";
        } else {
            return "para baixo";
        }
    }
    /* g) Implemente o método descricao() que retorna um texto descrevendo a função. Exemplo:
se os parâmetros A, B e C valem 3, -4 e 1, então o método deverá retornar a
string “y=3x2-4x+1”.*/

    public String descricao(){
        String funcao = "y=" + A + "x²";

        /* pra sair "-4" e não "+ -4"*/
        if (B < 0) {
            funcao += B + "x";
        } else if (B > 0) {
            funcao += "+" + B + "x";
        }
        if (C < 0) {
            funcao += C;
        } else if (C > 0) {
            funcao += "+" + C;
        }

        return funcao;
    }
}
