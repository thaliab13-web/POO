package lab04;

public class Avaliacao {
    private int nota;
    private String comentario;
    private Usuario usuario;
    private Filme filme;

    public Avaliacao(int nota, String comenta, Usuario usuario, Filme filme) {
        this.nota = nota;
        this.comentario = comenta;
        this.usuario = usuario;
        this.filme = filme;

        if(nota >= 1 &&
            nota <= 5) {
            nota = nota;
        } else {
            IO.println("Nota inválida!");
            this.nota = 1; // nota padrão
        }
    }
    @Override
    public String toString() {
        return String.format(
                """
                        Nota: %d
                        Comentário: %s
                        Usuário: %s
                        Filme:
                        """,
                nota,
                comentario,
                usuario,
                filme.getTitulo()
        );
    }


}
