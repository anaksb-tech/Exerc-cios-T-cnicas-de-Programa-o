Implemente a hierarquia de classes abaixo usando herança em Java:

MembroDaComunidade
├── Empregado
│   ├── CorpoDocente
│   │   ├── Administrador
│   │   └── Professor
│   └── Funcionarios
├── Aluno
└── Graduado

Para cada classe, defina três atributos específicos que façam sentido para
ela. Implemente também um método toString() que retorne todas as informações
do objeto, incluindo as herdadas da superclasse.

Dica: use super.toString() dentro de cada subclasse para reaproveitar a
descrição da classe pai e apenas acrescentar as informações novas.

No método main, instancie objetos de cada classe e exiba seus dados no console.
