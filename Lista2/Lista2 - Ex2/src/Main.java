public class Main {
    public static void main(String[] args) {
        // Criando uma instância de StringAlt com a frase "Eu vou a aula de TP nesta tarde"
        StringAlt s = new StringAlt("Eu vou a aula de TP nesta tarde");

        // Exibindo o tamanho da string
        System.out.printf("Tamanho: %s", s.length());

        // Exibindo o caractere na posição 2
        System.out.printf("Caractere na posição 2: %s", s.charAt(2));

        // Extraindo um substring (da posição 1 até 4)
        System.out.printf("Subtexto (1 a 4): %s", s.substring(1, 4));

        // Verificando se a string é igual a "Exemplo"
        System.out.printf("É igual a 'Exemplo'? %s", s.equals("Exemplo"));
        
        // Verificando se a string é igual a "eu vou a aula de tp nesta tarde" (ignorando maiúsculas e minúsculas)
        System.out.println("É igual a 'eu vou a aula de tp nesta tarde' (ignore case)? " + s.equalsIgnoreCase("eu vou a aula de tp nesta tarde"));

        // Encontrando o índice da primeira ocorrência do caractere 'a'
        System.out.println("Índice da primeira ocorrência do caractere 'a': " + s.indexOf('a'));

        // Verificando se a string está vazia
        System.out.println("Está vazia? " + s.isEmpty());

        // Substituindo o caractere 'a' por 'X'
        System.out.println("Substituindo 'a' por 'X': " + s.replace('a', 'X'));

        // Convertendo para maiúsculas
        System.out.printf("Para maiúsculo: %s", s.toUpperCase());

        // Convertendo para minúsculas
        System.out.printf("Para minúsculo: %s", s.toLowerCase());

        // Retirando os espaços no início e no final da string
        System.out.printf("Sem espaços: %s", s.trim());
            }
        }
