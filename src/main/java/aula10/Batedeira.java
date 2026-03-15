package aula10;

public class Batedeira {

    // atributos
    private String marca;
    private String cor;
    private double preco;
    private int qtdEstoque;

    // método set --> altera o estado do objeto, não retorna o valor
    public void setMarca(String m) {
        this.marca = m;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public void setPreco(double p) {
        this.preco = p;
    }
    public void setQtdEstoque(int q) {
        this.qtdEstoque = q;
    }

    // método get --> retorna o valor
    public String getMarca() {
        return marca;
    }
    public String getCor() {
        return cor;
    }
    public double getPreco() {
        return preco;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void mostrar() {
        IO.println("----- Produto disponivel no Estoque -----");
        IO.println("Batedeira Planetária");
        IO.println("Marca: " + marca);
        IO.println("Cor: " + cor);
        IO.println("Preço do produto: " + preco);
        IO.println("Quantidade do produto: " + qtdEstoque);
    }

}
