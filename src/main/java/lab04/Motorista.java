package lab04;

public class Motorista {
    private String nome;
    private String cpf;

    public Motorista(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format(
                """
                        Nome: %s
                        CPF: %s
                        """,
                nome,
                cpf
        );
    }
}
