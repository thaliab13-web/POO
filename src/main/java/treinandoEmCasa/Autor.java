package treinandoEmCasa;

public class Autor {
    private  int idAutor;
    private String nome;

    public Autor(int idAutor, String nome) {
        this.idAutor = idAutor;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format(
                "Autor{idAutor=%d, nome='%s'}",
                idAutor, nome
        );
    }
}
