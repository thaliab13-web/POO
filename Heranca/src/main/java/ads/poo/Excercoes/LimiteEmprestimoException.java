package ads.poo.Excercoes;

public class LimiteEmprestimoException extends BibliotecaException {
    public LimiteEmprestimoException(String usuario) {
        super("Erro: O livro " +  usuario + " atingiu o limite máximo de 3 livros emprestado");
    }
}
