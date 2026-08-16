public class Produto {

    private String nome;
    private double preco;
    private int estoque;
    private Categoria categoria;

    public Produto(String nome, double preco, int estoque, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
    }


    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public Categoria getCategoria() {
        return categoria;
    }



    public boolean retirarEstoque(int quantidade) {

        if (quantidade <= 0 || quantidade > estoque) {
            return false;
        }

        estoque -= quantidade;
        return true;
    }

    public void mostrarProduto(int numero) {
        System.out.printf(
            "%d. %-20s R$ %.2f | Estoque: %d%n",
            numero,
            nome,
            preco,
            estoque
        );
    }
}