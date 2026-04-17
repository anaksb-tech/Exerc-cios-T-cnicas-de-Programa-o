/* Crie uma classe Produto que uma loja de materiais vai
utilizar para representar um item vendido na loja. Um
Produto deve possuir
4 informações: um número de identificação (inteiro positivo que varia de 1 até 9999),
a quantidade de itens (inteiro não negativo),
o nome do produto (texto) e o
preço por item (um valor decimal não negativo).
Sua classe deve ter um construtor que inicializa os
quatro valores de modo íntegro. Sendo assim, para as
informações que achar necessário, crie métodos
Getters e Setters. Para valores default, considere que
um número de identificação padrão é 1, a quantidade
é 0, o preço é 0 e o nome é um texto vazio. */

public class Produto {

    private int numIdentificacao, qtdItens;
    private String nomeProduto;
    private double precoItem = 0;

    public Produto (int numIdentificacao, int qtdItens, String nomeProduto, double precoItem){

        if(numIdentificacao >= 1 && numIdentificacao <= 9999 ){

            this.numIdentificacao = numIdentificacao;

        } else {
            this.numIdentificacao = 1;
        }
        if(qtdItens > 0){
            this.qtdItens = qtdItens;
        } else {
            this.qtdItens = 0;
        }
        if (nomeProduto != ""){
            this.nomeProduto = nomeProduto;
        } else {
            this.nomeProduto = "";
        }
        if(precoItem > 0){
            this.precoItem = precoItem;
        } else {
            this.precoItem = 0;
        }
    }
      public int getNumIdentificacao(){
        return numIdentificacao;
 }
      public int getQtdItens(){
        return qtdItens;
 }
      public String getNomeProduto(){
        return nomeProduto;
      }
      public double getPrecoItem(){
        return precoItem;
      }
      public void setNumIdentificacao(int numIdentificacao) {
          if (numIdentificacao >= 1 && numIdentificacao <= 9999) {

              this.numIdentificacao = numIdentificacao;
          }
      }
      public void setQtd(int qtdItens){
          if(qtdItens > 0){
              this.qtdItens = qtdItens;
          }
      }
      public void setNomeProduto(String nomeProduto){
          if (nomeProduto != ""){
              this.nomeProduto = nomeProduto;
          }
      }
      public void setPrecoItem(double precoItem){
          if(precoItem > 0){
              this.precoItem = precoItem;
          }
      }
}
