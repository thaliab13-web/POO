package lab04;

import java.time.LocalDate;

public class Ator {
    private String nome;
    private LocalDate dataNasc;

    public Ator(String nome, LocalDate dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }
    @Override
    public  String toString() {
        return String.format(
                """
                        Nome: %s
                        Data Nascimento: %s
                        """,
                nome,
                dataNasc
        );
    }
}
