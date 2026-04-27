package treinandoEmCasa;

import java.util.ArrayList;

public class Livro {
    private int idLivro;
    private String titulo;
    private String idioma;
    private ArrayList<Autor> autores;
    private ArrayList<Edicao> edicoes;

    public Livro(int idLivro, String titulo, String idioma) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.idioma = idioma;
        this.autores = new ArrayList<>();
        this.edicoes = new ArrayList<>();
    }
    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public void adicionarEdicao(Edicao edicao) {
        edicoes.add(edicao);
    }

    @Override
    public String toString() {
        return String.format(
                "Livro{idLivro=%d, titulo='%s', idioma='%s', autores=%s, edicoes=%s}",
                idLivro, titulo, idioma, autores, edicoes
        );
    }
}
