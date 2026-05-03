package lab04;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private int anoLanc;
    private String genero;
    private Diretor diretor;
    private ArrayList<Ator> atores;
    private ArrayList<Avaliacao> avaliacoes;

    public Filme(String titulo, int anoLanc, String genero, Diretor diretor) {
        this.titulo = titulo;
        this.anoLanc = anoLanc;
        this.genero = genero;
        this.diretor = diretor;
        this.atores = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }
    public String getTitulo() {
        return titulo;
    }

    public void addAtor(Ator ator) {
        atores.add(ator);
    }
    public void addAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }
    @Override
    public String toString() {
        return String.format(
                """
                        Titulo: %s
                        Ano Lançamento: %s
                        Género: %s
                        Diretor: %s
                        Ator: %s
                        Avaliação: %s
                        """,
                titulo,
                anoLanc,
                genero,
                diretor,
                atores,
                avaliacoes
        );
    }
}
