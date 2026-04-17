public class Main {
    public static void main(String[] args) {
        Tweet tweet1 = new Tweet("Hoje aconteceu a aula de TP e eu estudei bastante, a aula de TP é legal");

        System.out.printf("Parágrafo: %s\n", tweet1.getParagrafo());

        System.out.printf("Número de caracteres: %s\n", tweet1.contarCaracteres());

        System.out.printf("Número de palavras: %s\n", tweet1.quantidadePalavras());

        System.out.printf("Número de frases: %s\n", tweet1.quantidadeFrases());

        String palavra = "aula";
        System.out.printf("A palavra %s aparece %d vez(es)\n",palavra, tweet1.aparecePalavra(palavra));

        // Testando setter com parágrafo inválido (maior que 144)
        tweet1.setParagrafo("Esse texto é beeem longo, entao estou fazendo ele para testar o setter, " +
                "será que ele vai aceitar? Não seria bom se aceitasse, pois estaria totalmente errado " +
                "e fora do previsto, então, espero que ele passe tranquilamente pelo teste");

        System.out.printf("Parágrafo aleatório: %s\n", Tweet.gerarParagrafoAleatorio());
    }
}
