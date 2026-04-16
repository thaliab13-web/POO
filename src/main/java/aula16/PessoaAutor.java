package aula16;

public class PessoaAutor {

    private String nome;
    private String cpf;
    private String email;

    // construtor inicializando o objeto quando ele nasce (Inicializa os Atributos)
    public PessoaAutor(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // Transformando o objeto em texto
    @Override
    public String toString() {

        // criando um objeto para concatenar os textos
        final StringBuilder sb = new StringBuilder();

        // c é pra pular linha
        char c = '\n';

        sb.append("Nome: ").append(nome).append(c);
        sb.append("CPF: ").append(cpf).append(c);
        sb.append("Email: ").append(email).append(c);

        return sb.toString();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
