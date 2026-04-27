package treinandoEmCasa;

public class Editora {

    private int idEditora;
    private String nome;
    private String cidade;

    public Editora(int idEditora, String nome, String cidade) {
        this.idEditora = idEditora;
        this.nome = nome;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return String.format(
                "Editora{idEditora=%d, nome='%s', cidade='%s'}",
                idEditora, nome, cidade
        );
    }
}
