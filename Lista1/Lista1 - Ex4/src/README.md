Uma função quadrática é definida por f(x) = ax² + bx + c, onde a, b e c são
coeficientes reais e 'a' não pode ser zero.

Crie uma classe chamada FuncaoQuadratica com os atributos A, B e C. O atributo A
precisa de encapsulamento pois não pode ser zero — implemente getters e setters
e justifique com um comentário no código.

A classe deve ter um construtor que recebe os três coeficientes. Além disso,
implemente os seguintes métodos:

- raiz1() e raiz2(): retornam os valores das duas raízes da função usando a
  fórmula de Bhaskara. Use Math.sqrt() para a raiz quadrada.

- xVertice() e yVertice(): retornam as coordenadas do vértice da parábola,
  calculados como xv = -b / (2a) e yv = -(b² - 4ac) / (4a).

- concavidade(): retorna "para cima" se A > 0, ou "para baixo" se A < 0.

- descricao(): retorna uma string descrevendo a função no formato "y=Ax²+Bx+C".

No método main, leia os valores de a, b e c pelo teclado, instancie um objeto
FuncaoQuadratica e exiba a descrição, o vértice, as raízes e a concavidade.
Teste com os valores 3, -4 e 1.
