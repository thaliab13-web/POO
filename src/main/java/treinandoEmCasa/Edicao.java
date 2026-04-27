package treinandoEmCasa;

public class Edicao {
    private int idEdicao;
    private int ano;
    private int paginas;
    private String isbn;
    private Editora editora;  // agregação, relacionamento fraco


    public Edicao(int idEdicao, int ano, int paginas, String isbn, Editora editora) {
        this.idEdicao = idEdicao;
        this.ano = ano;
        this.paginas = paginas;
        this.isbn = isbn;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return String.format(
                "\n Edicao:\n " +
                "   idEdicao=%d\n" +
                "   ano=%d\n" +
                "   paginas=%d\n" +
                "   isbn='%s'\n" +
                "   editora=%s",
                idEdicao, ano, paginas, isbn,editora
        );
    }
}
