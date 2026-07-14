package ads.poo.Excercoes;

import java.util.ArrayList;
import java.util.UUID;

public class Biblioteca {
   private ArrayList<Usuario> usuario;
    private static final int LIMITE = 3;

    public Biblioteca() {
        this.usuario = new ArrayList<>();
    }

  public void emprestarLivro(Livro livro, Usuario usuario) throws BibliotecaException {
        // verifica o limite
        if (usuario.getLivrosEmprestado().size() >= LIMITE) {
            throw new LivroEmprestadoException( "Usuario atingiu o limite de emprestimos");
        }
        // verifica se o livro já esta emprestado
      if (livro.isEmprestado()) {
          throw new LivroEmprestadoException( "Livro já está emprestado");
      }
      // realiza emprestimo
      usuario.getLivrosEmprestado().add(livro);
      livro.setEmprestado(true);
      IO.println("Livro emprestado");
  }

  public void devolverLivro(Livro livro, Usuario usuario) throws BibliotecaException {
        // se a lista de livros do usuario não contiver o livro
        if (!usuario.getLivrosEmprestado().contains(livro)) {
            throw new DevolucaoLivroException("Este livro não foi emprestado");
        }
        // remove livro
      usuario.getLivrosEmprestado().remove(livro);
        // marca como disponivel
      livro.setEmprestado(false);
      IO.println("Livro devolvido");
  }
}
