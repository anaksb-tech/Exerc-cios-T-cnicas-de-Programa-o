Implemente um sistema bancário em Java composto pelos seguintes elementos:

Interface Rendimento: declara o método rendimento() sem retorno.

Classe ContaComum: classe base com os atributos numConta, saldo e titular.
Deve ter métodos para abrir a conta (com ou sem saldo inicial), depositar,
sacar e consultar o saldo. Implemente validações adequadas (ex: saldo
suficiente para saque, valores positivos).

Classe ContaEspecial (herda de ContaComum, implementa Rendimento): adiciona
o atributo juros e um método de saque com limite especial (permite sacar além
do saldo até um limite informado). O método rendimento() aplica os juros sobre
o saldo atual.

Classe ContaPoupanca (herda de ContaComum, implementa Rendimento): o método
rendimento() aplica uma taxa fixa de 0,5% sobre o saldo atual.

No método main, demonstre o funcionamento das três classes realizando
operações de abertura, depósito, saque e rendimento.
