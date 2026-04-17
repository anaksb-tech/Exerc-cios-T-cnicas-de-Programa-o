/* Crie uma classe chamada Tweet que contenha como atributo um parágrafo
de no máximo 144 caracteres. */

public class Tweet {
    private String paragrafo;
    private String palavraBuscada;

    public Tweet (String paragrafo){

        if (paragrafo == null || paragrafo.isEmpty()) {
            System.out.println("O parágrafo não pode ter 0 caracteres");
            this.paragrafo = "";

        } else if (paragrafo.length() <= 144) {
                this.paragrafo = paragrafo;

        } else{
            System.out.println("O parágrafo só pode ter no máximo 144 caracteres");
            this.paragrafo = "";
        }
    }

    /* b. Há necessidade de métodos setters e getters? Existe alguma limitação para
o que o parágrafo pode conter? Se sim, crie os métodos correspondentes e
coloque os modificadores de acesso apropriados.*/

    public String getParagrafo() {
        return paragrafo;
    }
    public void setParagrafo(String paragrafo){
            if (paragrafo == null || paragrafo.isEmpty()) {
                System.out.println("O parágrafo não pode ter 0 caracteres");
                this.paragrafo = "";

            } else if (paragrafo.length() <= 144) {
                this.paragrafo = paragrafo;

            } else{
                System.out.println("O parágrafo só pode ter no máximo 144 caracteres");
                this.paragrafo = "";
            }
        }

    /* c. Crie um método para contar a quantidade de caracteres do seu parágrafo.*/

    public int contarCaracteres(){
            return paragrafo.length();
        }

    /* d. Crie um método para contar a quantidade de palavras do seu parágrafo.*/

    public int quantidadePalavras() {

      if (paragrafo == null || paragrafo.isEmpty()){
       return 0;
      }
        String[] palavras = paragrafo.trim().split(" ");

        int contador = 0;
        for (int i = 0; i < palavras.length; i++) {
            if (!palavras[i].isEmpty()) {
                contador++;
            }
        }
        return contador;
    }


    /* e. Crie um método para contar a quantidade de frases do seu parágrafo.*/

    public int quantidadeFrases(){
        if (paragrafo == null || paragrafo.isEmpty()){
            return 0;
        }
        String[] frases = paragrafo.trim().split("[.!?]");

        int contador = 0;
        for (int i = 0; i < frases.length; i++) {
            if (!frases[i].trim().isEmpty()) {
                contador++;
            }
        }

        return contador;
    }


    /* f. Crie um método que recebe uma palavra como argumento e verifique
quantas vezes ele aparece no parágrafo.*/

    public int aparecePalavra(String palavraBuscada){
        if (palavraBuscada == null || palavraBuscada.isEmpty() ){
            return 0;
        }
 String[] palavrasString = paragrafo.trim().split(" ");
       int contador = 0;

        for (int i = 0; i < palavrasString.length; i++) {
            if (palavrasString[i].equalsIgnoreCase(palavraBuscada)) {
                contador++;
            }
        }
        return contador;
    }

    /* g. Crie um método que pode ser utilizado sem instanciar um objeto da classe
para gerar um parágrafo aleatório, retornando uma String */

    public static String gerarParagrafoAleatorio() {
    String[] frases = {
            "Os dias de hoje estão cada dia mais difíceis",
            "Mude o ângulo e tudo pode parecer diferente",
            "Às vezes, a resposta está no silêncio",
            "Curiosidade é o motor da inovação.",
            "Cada erro é uma lição.",
            "Não é o fim. Tente de novo.",
            "Disciplina supera motivação.",
            "Pequenos passos constroem grandes jornadas.",
            "Todos merecem uma segunda chance.",
    };

    String resultado = "";
    while (resultado.length() + 30 < 144) {
        int i = (int) (Math.random() * frases.length);
        resultado = resultado + frases[i] + " ";
    }

    return resultado.trim();
}
}
