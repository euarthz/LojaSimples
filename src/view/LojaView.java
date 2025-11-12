package view;

import controller.LojaController;
import java.util.Scanner;
import model.Produto;

// A classe LojaView representa a camada de visão (View) do padrão MVC.
public class LojaView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LojaController controller = new LojaController();

        while (true) {
            System.out.println("\n=== Loja Simples ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Calcular valor total");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    controller.adicionarProduto(nome, preco);
                    break;

                case 2:
                    System.out.println("\nProdutos:");
                    for (Produto p : controller.listarProdutos()) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("Valor total: R$" + controller.calcularValorTotal());
                    break;

                case 4:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
// A classe LojaView é a "View" no padrão MVC.
// É responsável pela interação com o usuário:
//  - Exibe o menu e solicita dados via Scanner;
//  - Envia os comandos para o Controller;
//  - Mostra os resultados e mensagens na tela.
//
// Aqui não há lógica de negócios, apenas interface de texto.