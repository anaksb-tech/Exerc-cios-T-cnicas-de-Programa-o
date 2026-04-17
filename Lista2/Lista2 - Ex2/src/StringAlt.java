public class StringAlt {
    private char[] dados;

    // Construtor que converte String em vetor de caracteres
    public StringAlt(String texto) {
        dados = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            dados[i] = texto.charAt(i);
        }
    }

    // Retorna o comprimento da string
    public int length() {
        int total = 0;
        for (char c : dados) {
            total++;
        }
        return total;
    }

    // Retorna o caractere na posição solicitada
    public char charAt(int indice) {
        if (indice >= 0 && indice < length()) {
            return dados[indice];
        }
        return '\0'; // caractere nulo
    }

    // Extrai parte da string (como substring)
    public String substring(int inicio, int fim) {
        if (inicio < 0 || fim > length() || inicio > fim) {
            System.out.println("Índices inválidos.");
            return "";
        }

        String resultado = "";
        for (int i = inicio; i < fim; i++) {
            resultado += dados[i];
        }
        return resultado;
    }

    // Compara com outra string (case-sensitive)
    public boolean equals(String outra) {
        if (outra == null || outra.length() != length()) return false;
        for (int i = 0; i < dados.length; i++) {
            if (dados[i] != outra.charAt(i)) return false;
        }
        return true;
    }

    // Compara com outra string ignorando maiúsculas e minúsculas
    public boolean equalsIgnoreCase(String outra) {
        if (outra == null || outra.length() != dados.length) return false;
        for (int i = 0; i < dados.length; i++) {
            char a = dados[i];
            char b = outra.charAt(i);

            if (a >= 'A' && a <= 'Z') a += 32;
            if (b >= 'A' && b <= 'Z') b += 32;

            if (a != b) return false;
        }
        return true;
    }

    // Retorna índice da primeira ocorrência de um caractere
    public int indexOf(char ch) {
        for (int i = 0; i < dados.length; i++) {
            if (dados[i] == ch) return i;
        }
        return -1;
    }

    // Verifica se está vazia
    public boolean isEmpty() {
        return dados.length == 0;
    }

    // Substitui caracteres
    public String replace(char antigo, char novoC) {
        String resultado = "";
        for (char c : dados) {
            if (c == antigo) {
                resultado += novoC;
            } else {
                resultado += c;
            }
        }
        return resultado;
    }

    // Retorna nova string com letras maiúsculas convertidas para minúsculas
    public String toLowerCase() {
        String resultado = "";
        for (int i = 0; i < dados.length; i++) {
            char c = dados[i];
            if (c >= 'A' && c <= 'Z') {
                resultado += (char)(c + ('a' - 'A'));
            } else {
                resultado += c;
            }
        }
        return resultado;
    }

    // Retorna nova string com letras minúsculas convertidas para maiúsculas
    public String toUpperCase() {
        String resultado = "";
        for (int i = 0; i < dados.length; i++) {
            char c = dados[i];
            if (c >= 'a' && c <= 'z') {
                resultado += (char)(c - ('a' - 'A'));
            } else {
                resultado += c;
            }
        }
        return resultado;
    }

    // Retira os espaços no início e no final da string
    public String trim() {
        int inicio = 0;
        int fim = dados.length - 1;

        // Encontra o primeiro caractere não branco
        while (inicio <= fim && dados[inicio] <= ' ') {
            inicio++;
        }

        // Encontra o último caractere não branco
        while (fim >= inicio && dados[fim] <= ' ') {
            fim--;
        }

        // Extrai a substring
        return substring(inicio, fim + 1);
    }
}
