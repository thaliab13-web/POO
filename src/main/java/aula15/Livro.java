package aula15;

public class Livro {

    // Sistema de uma livraria para gestão de acervo
    private final String ISBN;
    private String autor;
    private String anoLancamento;
    private String nomeLivro;

    // Construtor, inicializa o estado do objeto
    // definindo valores iniciais para seus atributos  e garatindo
    // que objeto seja criado em um estado válido
    public Livro(String ISBN, String nomeLivro, String anoLancamento, String autor) {
        this.ISBN = ISBN;
        this.nomeLivro = nomeLivro;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
    }

    // retornando a chave ISBN
    public String getISBN() {
        return ISBN;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return String.format("""
                ISBN: %s
                Autor: %s
                Ano lançamento: %s
                Nome do Livro: %s
                """, ISBN, autor, anoLancamento, nomeLivro);
    }
}
