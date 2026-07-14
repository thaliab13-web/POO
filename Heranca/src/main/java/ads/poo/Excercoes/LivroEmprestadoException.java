package ads.poo.Excercoes;

public class LivroEmprestadoException extends BibliotecaException {
    public LivroEmprestadoException(String titulo) {
        super("Erro: O livro " + titulo + " não foi emprestado ou já está na biblioteca");
    }
}
