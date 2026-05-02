package lab17;

import java.time.LocalDate;

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

    public String toString() {
        return String.format(
                "Contato {nome='%s', sobrenome='%s', dataNasc=%s, telefones=%s, emails=%s}",
                nome, sobrenome, dataNasc, telefones, emails
        );

    }

}