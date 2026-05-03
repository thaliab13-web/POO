package lab04;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    @Override
    public String toString() {
        return String.format(
                """
                        Nome: %s
                        Email: %s
                        Senha: %s
                        """,
                nome,
                email,
                senha
        );
    }
}
