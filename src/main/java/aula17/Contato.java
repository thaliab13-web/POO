package aula17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    // Composição
    private ColecaoTelefone telefones;
    private ColecaoEmail emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        // Composição
        this.telefones = new ColecaoTelefone();
        this.emails = new ColecaoEmail();
    }
    public String getNome() { return nome;}
    public String getSobrenome() { return sobrenome;}

    // delegando a responsabilidade pra outra classe
    public boolean addTelefone(String rotulo, String valor) {
      return telefones.add(rotulo, valor);
    }

    public boolean addEmail(String rotulo, String valor) {
        return emails.add(rotulo, valor);
    }

    public boolean removeTelefone(String rotulo) {
        return telefones.remove(rotulo);
    }
    public boolean removeEmail(String rotulo) {
        return emails.remove(rotulo);
    }

    public boolean updateTelefone(String rotulo, String valor) {
        return telefones.update(rotulo, valor);
    }

    public boolean updateEmail(String rotulo, String valor) {
        return emails.update(rotulo, valor);
    }

    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public String toString() {
        return String.format(
                """
                Nome: %s %s
                Data de Nascimento: %s
                Telefone: %s
                Email: %s
                """,
                nome,
                sobrenome,
                dataNasc.format(f),
                telefones,
                emails
        );

    }

}