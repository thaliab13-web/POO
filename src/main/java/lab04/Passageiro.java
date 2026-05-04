package lab04;

public class Passageiro {
    private String nome;
    private String email;
    private int telefone;

    public Passageiro(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return String.format(
                """
                        Nome: %s
                        Email: %s
                        Telefone: %s
                        """,
                nome,
                email,
                telefone
        );
    }
}
