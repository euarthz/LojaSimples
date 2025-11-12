Loja Simples (Java - MVC)



Um projeto simples em Java desenvolvido com o padrão MVC (Model-View-Controller).

Ele simula uma loja básica, permitindo adicionar produtos, listar produtos e calcular o valor total da compra.



Funcionalidades



Adicionar produtos com nome e preço



Listar todos os produtos cadastrados



Calcular o valor total dos produtos



Interface de console (menu interativo)



Padrão MVC



O projeto segue o padrão Model-View-Controller:



src/

├── controller/

│ └── LojaController.java → Controla a comunicação entre a View e o Model

├── model/

│ ├── Produto.java → Representa um produto

│ └── GerenciadorProdutos.java → Gerencia a lista de produtos

└── view/

└── LojaView.java → Interface com o usuário (console)



Como executar



Compilar o projeto



No terminal, dentro da pasta do projeto:

javac -d bin src/\*\*/\*.java



Executar o programa

java -cp bin view.LojaView



Exemplo de uso



=== Loja Simples ===

1 - Adicionar produto

2 - Listar produtos

3 - Calcular valor total

4 - Sair



Escolha uma opção: 1

Nome do produto: Camiseta

Preço: 50.0



=== Loja Simples ===

1 - Adicionar produto

2 - Listar produtos

3 - Calcular valor total

4 - Sair

Escolha uma opção: 3

Valor total: R$50.0



Estrutura de Classes



Camada | Classe | Responsabilidade

Model | Produto | Representa um item da loja

Model | GerenciadorProdutos | Armazena e manipula a lista de produtos

Controller | LojaController | Faz a ponte entre a View e o Model

View | LojaView | Interage com o usuário via terminal



Autor



Arthur Santos

Estudante de Engenharia de Software – Universidade Católica de Brasília (UCB)

GitHub: https://github.com/euarthz



Licença



Este projeto é livre para fins educacionais e acadêmicos.

