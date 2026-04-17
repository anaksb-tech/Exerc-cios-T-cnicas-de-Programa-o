/* a) Quais são os atributos e métodos da classe?
Atributos: Puvliosidade e tempo, que são vetores
Métodos: Puvliosidade, Pressão, CalcularMediaPluvial, CalcularMaximaPluvial e CalcularPressaoMinima.
b) A classe possui um método construtor? Caso não, o que acontece se um método construtor não for
definido?
Não. Se o construtor serve para diferenciamos os atributos dos parâmetros, e a classe não
possui, esses valores poderiam ser confundidos. O próprio java até cria um construtor padrão
mas não iria garantir que pluviosidade e pressão tenham tamanho 7 (além de evitar erros).

c) A visibilidade dos atributos está adequada? Caso não, justifique sua resposta e corrija o código.
Não. Deveriam ser privados, já que queremos que sejam acessados apenas por métodos
definidos dentro da sua classe. Restringir o acesso a membros da classe é fundamental
pois o encapsulamento previne o uso inadequado de um objeto.

d) Por que não foram implementados métodos Getters?
Porque o enunciado diz que "Não é necessário que esses dados sejam lidos fora da
classe" apenas atualizados. Por isso, métodos getters não são necessários, mas
métodos setters sim."
e) Implemente os blocos de código que estão faltando.
f) Teste sua classe instanciando um objeto no método main() de acordo com o que é mostrado abaixo.*/

public class Main {
    public static void main(String[] args)
    {
// vetores criados simplesmente para testar a classe
        double[] chuva = { 5.35, 2.34, 0.0, 0.0, 3.23, 0.0, 2.42 };
        double[] pressao = { 99.3, 95.34, 101.3, 98.42, 103.4, 100.0, 102.87 };
        ClimaTempo ct = new ClimaTempo();
        ct.setPluviosidade(chuva);
        ct.setPressao(pressao);
// deve resultar 5.35
        System.out.printf("Máxima pluvial: \n" + ct.calcularMaximaPluvial());
// deve resultar ~ 1.904
        System.out.printf("\nMédia pluvial: \n" + ct.calcularMediaPluvial());
// deve resultar 95.34
        System.out.printf("\nPressão mínima: \n" + ct.calcularPressaoMinima());
    }
}