/* O imperador Romano, Júlio César, usava a Cifra de
César para enviar ordens secretas aos seus generais.
A ideia era trocar cada letra de uma mensagem pela
terceira letra seguinte. Ou seja, a letra ‘a’ era
substituída por ‘d’, a letra ‘b’ era substituída por ‘e’, e
assim por diante.
Escreva uma classe chamada Cifra. Essa classe não
possui atributos, mas possui um método denominado
Criptografar que recebe uma string como parâmetro
e retorna outra string criptografada assim como a
Cifra de César. Essa classe também implementa o
método Descriptografar que recebe como parâmetro
uma string cifrada e retorna a mensagem original.
Teste no seu programa principal dentro do método
main a utilização da sua classe.*/

public class Cifra {
    public String Criptografar(String mensagemOriginal) {
        String mensagemCriptografada = "";

        for (int i = 0; i < mensagemOriginal.length(); i++) {
            char c = mensagemOriginal.charAt(i);

            // Verifica se é uma letra minúscula
            if (Character.isLowerCase(c)) {
                c = (char) ('a' + (c - 'a' + 3) % 26);
            }
            // Verifica se é uma letra maiúscula
            else if (Character.isUpperCase(c)) {
                c = (char) ('A' + (c - 'A' + 3) % 26);
            }

            mensagemCriptografada += c;
        }

        return mensagemCriptografada;
    }

    public String Descriptografar(String mensagemOriginal) {
        String mensagemDescriptografada = "";

        for (int i = 0; i < mensagemOriginal.length(); i++) {
            char c = mensagemOriginal.charAt(i);

            if (Character.isLowerCase(c)) {
                c = (char) ('a' + (c - 'a' - 3 + 26) % 26);
            } else if (Character.isUpperCase(c)) {
                c = (char) ('A' + (c - 'A' - 3 + 26) % 26);
            }

            mensagemDescriptografada += c;
        }

        return mensagemDescriptografada;

    }
}
