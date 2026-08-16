import java.util.ArrayList;

public class Pedido {

    private ArrayList<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {

        if (produto.retirarEstoque(quantidade)) {

            ItemPedido item = new ItemPedido(produto, quantidade);

            itens.add(item);

            System.out.println("\nProduto adicionado ao carrinho!");

        } else {

            System.out.println("\nQuantidade indisponível no estoque.");
        }
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public boolean estaVazio() {
        return itens.isEmpty();
    }

    public void mostrarPedido() {

        if (itens.isEmpty()) {
            System.out.println("\nCarrinho vazio.");
            return;
        }

        System.out.println("\n========== CARRINHO ==========");

        for (ItemPedido item : itens) {
            item.mostrarItem();
        }

        System.out.println("------------------------------");
        System.out.printf("TOTAL: R$ %.2f%n", calcularTotal());
    }
}