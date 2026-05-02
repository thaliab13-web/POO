package lab04;

public class ItemPedido {
    private int quantidade;
    private double precoUnitario;
    private Produto produto; // Associação simples, recebendo a classe produto

    public ItemPedido(int qtd, double preUni, Produto produto) {
        this.quantidade = qtd;
        this.precoUnitario = preUni;
        this.produto = produto; // referenciando a classe Produto
    }

    @Override
    public String toString() {
        return String.format(
                """
                Produto: %s
                Quantidade: %d
                Preço Unitário: %.2f
                """,
                produto,
                quantidade,
                precoUnitario
        );
    }
}
