/* Crie uma classe Produto que uma loja de materiais vai
utilizar para representar um item vendido na loja. Um
Produto deve possuir 4 informações: um número de
identificação (inteiro positivo que varia de 1 até 9999),a quantidade de itens (inteiro não negativo), o nome
do produto (texto) e o preço por item (um valor
decimal não negativo).
Sua classe deve ter um construtor que inicializa os
quatro valores de modo íntegro. Sendo assim, para as
informações que achar necessário, crie métodos
Getters e Setters. Para valores default, considere que
um número de identificação padrão é 1, a quantidade
é 0, o preço é 0 e o nome é um texto vazio. */
public class Main {
    public static void main (String[] args){

     Produto produto1 = new Produto (100, 40, "Caneta", 10.00);
     Produto produto2 = new Produto (-2, -2, "", -100);

     System.out.printf("Produto: %s \n",produto1.getNomeProduto());
     System.out.printf("Numero de Identificação: %d\n", produto1.getNumIdentificacao());
     System.out.printf("Quantidade de itens: %d \n", produto1.getQtdItens());
     System.out.printf("Preço por item: R$ %.2f\n", produto1.getPrecoItem());

     /* Testando o setter */

        produto1.setNumIdentificacao(10000);
        produto1.setQtd(-5);
        produto1.setPrecoItem(-3.5);

        System.out.println("\nTeste inválido com o setter:");
        System.out.printf("Produto: %s \n",produto1.getNomeProduto());
        System.out.printf("Numero de Identificação: %d\n", produto1.getNumIdentificacao());
        System.out.printf("Quantidade de itens: %d\n", produto1.getQtdItens());
        System.out.printf("Preço por item: R$ %.2f\n", produto1.getPrecoItem());


        System.out.println("\nSegundo exemplo com numeros inválidos:");
        System.out.printf("Produto: %s \n",produto2.getNomeProduto());
        System.out.printf("Numero de Identificação: %d\n", produto2.getNumIdentificacao());
        System.out.printf("Quantidade de itens: %d \n", produto2.getQtdItens());
        System.out.printf("Preço por item: R$ %.2f\n", produto2.getPrecoItem());
    }
}