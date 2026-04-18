Crie uma classe chamada StringAlt que reimplementa alguns métodos da classe
String do Java sem utilizar os métodos nativos — tudo deve ser feito na mão,
usando estruturas de repetição.

O construtor deve receber um vetor de caracteres (char[]) e armazená-lo como
atributo.

Implemente os seguintes métodos:
- charAt(int n): retorna o caractere na posição n (índice começa em zero)
- equals(String outra): compara com outra string (case-sensitive)
- equalsIgnoreCase(String outra): compara ignorando maiúsculas e minúsculas
- indexOf(char ch): retorna o índice da primeira ocorrência de ch, ou -1
- contains(String str): verifica se a string contém uma substring
- isEmpty(): verifica se a string é vazia
- replace(char velho, char novo): substitui todas as ocorrências de um caractere
- substring(int inicio, int fim): retorna os caracteres do índice inicio até fim-1
- split(String str): divide a string na sequência str e retorna as partes
- toLowerCase(): retorna a string em letras minúsculas
- toUpperCase(): retorna a string em letras maiúsculas
- trim(): remove espaços em branco no início e no fim da string
