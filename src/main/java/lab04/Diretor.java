package lab04;

public class Diretor {
    private String nome;
    private String email;

    public Diretor(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    @Override
    public String toString() {
        return String.format(
                """
                        Nome: %s
                        Email: %s
                        """,
                nome,
                email
        );
    }
}
