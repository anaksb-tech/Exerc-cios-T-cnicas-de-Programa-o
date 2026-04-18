Uma classe chamada ClimaTempo foi criada para calcular estatísticas semanais de
pluviosidade e pressão atmosférica. Ela armazena dois vetores de exatamente 7
elementos cada. Os dados não precisam ser lidos de fora da classe, mas devem
poder ser atualizados.

O código abaixo foi entregue com erros propositais de implementação e
conceituação. Analise-o e responda:

a) Quais são os atributos e métodos da classe?
b) A classe possui construtor? O que acontece em Java quando nenhum é definido?
c) A visibilidade dos atributos está correta? Justifique e corrija se necessário.
d) Por que não foram implementados métodos getters?
e) Implemente os métodos que estão faltando:
   - setPluviosidade e setPressao: só devem aceitar vetores de tamanho 7
   - calcularMediaPluvial: retorna a média dos 7 valores de pluviosidade
   - calcularMaximaPluvial: retorna o maior valor de pluviosidade da semana
   - calcularPressaoMinima: retorna o menor valor de pressão da semana
f) Teste a classe no método main com os dados fornecidos no enunciado.
