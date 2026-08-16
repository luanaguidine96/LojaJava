import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(
            new Produto(
                "Cafe Expresso",
                5.00,
                20,
                Categoria.CAFE
            )
        );

        produtos.add(
            new Produto(
                "Capuccino",
                8.00,
                15,
                Categoria.CAFE
            )
        );

        produtos.add(
            new Produto(
                "Suco de Laranja",
                6.00,
                10,
                Categoria.BEBIDA
            )
        );

        produtos.add(
            new Produto(
                "Pao de Queijo",
                4.00,
                25,
                Categoria.COMIDA
            )
        );

        produtos.add(
            new Produto(
                "Brownie",
                7.00,
                12,
                Categoria.DOCE
            )
        );

        Pedido pedido = new Pedido();

        int opcao;

        do {

            System.out.println("\n================================");
            System.out.println("           CAFE EXPRESS");
            System.out.println("================================");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Finalizar pedido");
            System.out.println("3. Sair");
            System.out.println("================================");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                
                case 1:

                    System.out.println("\n========== CARDAPIO ==========");

                    for (int i = 0; i < produtos.size(); i++) {
                        produtos.get(i).mostrarProduto(i + 1);
                    }

                    System.out.print("\nEscolha o produto: ");
                    int escolha = scanner.nextInt();

                    if (escolha < 1 || escolha > produtos.size()) {
                        System.out.println("Produto invalido.");
                        break;
                    }

                    Produto produtoEscolhido = produtos.get(escolha - 1);
// Pega o produto certinho da prateleira pq os array começam em zero, entao por mais que a maça esteja mostrando ser o numero 1, para buscar ela no array, ela vai ta armazenada na posição 0
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    pedido.adicionarItem(
                        produtoEscolhido,
                        quantidade
                    );

                    break;

                

                case 2:

                    if (pedido.estaVazio()) {

                        System.out.println("\nSeu carrinho esta vazio.");

                    } else {

                        pedido.mostrarPedido();

                        System.out.println("\nPedido finalizado!");
                        System.out.println("Obrigado por comprar no Cafe Express!");

                    }

                    break;

                case 3:

                    System.out.println("\nAte logo! ");

                    break;

                default:

                    System.out.println("\nOpcao invalida.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}