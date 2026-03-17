package exemplosCasa;

public class Produto {


    private String nome;
    private double preco;
    private int qtdEstoque;

    public void  setPreco(double p) {
        this.preco = p;
    }

    public void setQtdEstoque(int e) {
        this.qtdEstoque = e;
    }

    /* Ação do método*/
  public void adicionarEstoque(int qtd) {
        qtdEstoque += qtd;
  }

  /* Valor do estoque não fica negativo */
  public void removerEstoque(int qtd) {
        if(qtd <= qtdEstoque) {
            qtdEstoque -= qtd;
        }
  }
    public void setNome(String n) {
        this.nome = n;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void mostrarDados() {
        IO.println("Nome produto: " + nome);
        IO.println("Preço produto: " + preco);
        IO.println("Quantidade no estoque: " + qtdEstoque);
    }
 }
