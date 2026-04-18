Ao modelar classes para cálculo de juros, percebe-se que JurosSimples e
JurosCompostos compartilham os mesmos três atributos: capital, taxa e tempo.
A diferença entre elas está apenas no método calcularJuros().

Utilize herança para evitar repetição: crie uma superclasse com os atributos
comuns e duas subclasses que herdam dela e implementam calcularJuros() cada
uma com sua própria fórmula.

Fórmula dos juros simples:  J = C * i * t
Fórmula dos juros compostos: J = C * (1 + i)^t - C

Restrições:
- Capital deve ser um número positivo
- Taxa deve ser um valor entre 0,0 e 1,0
- Tempo é dado em meses
