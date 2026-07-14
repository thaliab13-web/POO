package ads.poo.Excercoes;

public class DevolucaoLivroException extends BibliotecaException {
    public DevolucaoLivroException(String titulo) {
        super("Erro: O livro " + titulo + "já foi devolvido");
    }
}
