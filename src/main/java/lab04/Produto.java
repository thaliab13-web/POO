package lab04;

public class Produto {
    private String descricao;
    private double preco;
    private int qtdEstoque;

    public Produto(String descricao, double preco, int qtdEstoque) {
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }
    @Override
    public String toString() {
        return String.format(
                """
                Descrição: %s
                Preço: %.2f
                Quantidade: %d
                """,
                descricao,
                preco,
                qtdEstoque
        );
    }

}
