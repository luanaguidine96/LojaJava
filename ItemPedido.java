public class ItemPedido {

    private Produto produto;
    private int quantidade;
//caixinha que guarda o que eu pedi
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
//caixinha dos calculos
    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }
//caixinha mostrar itens
    public void mostrarItem() {
        System.out.printf(
            "%d x %-20s R$ %.2f%n",
            quantidade,
            produto.getNome(),
            calcularSubtotal()
        );
    }
}