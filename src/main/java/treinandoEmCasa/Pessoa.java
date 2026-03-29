package treinandoEmCasa;

public class Pessoa {

    private String nome;
    private String email;
    private String cpf;

    public Pessoa(String email, String nome, String cpf) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", cpf='").append(cpf).append('\'');
        sb.append('}');
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