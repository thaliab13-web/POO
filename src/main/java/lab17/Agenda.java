package lab17;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    // adicionando contatos a lista
    public boolean adicionarContato(Contato c) {
        if (c == null) return false;
        contatos.add(c); // adiciona o contato atual na lista
        return true;
    }

    // buscando contato na lista
    public Contato buscarContato(String nome) {
        // percorrendo a lista contato por contato
        for(Contato c : contatos) {
            // Comparando o nome digitado
            // com o nome que tenho dentro da casse Contato (String nome)
            if (c.getNome().equals(nome)) {
                return c;
            }
        }
        // retorna nulo se não achar o nome
        return null;
    }
    public ArrayList<Contato> encontrarContato(String nome, String sobrenome) {
        ArrayList<Contato> encontrados = new ArrayList<>();

        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome) &&
                    c.getSobrenome().equalsIgnoreCase(sobrenome)) {
                encontrados.add(c);
            }
        }
        return encontrados;
    }
    // get para retorna a lista
    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public boolean removerContato(int indiceContatoNaLista) {
        if (indiceContatoNaLista < 0 ||
                indiceContatoNaLista >= contatos.size()) return false;
        contatos.remove(indiceContatoNaLista);
        return true;
    }

    public boolean addTelefone(String rotulo, String valor, int indiceContatoNaLista) {
        if (indiceContatoNaLista < 0 ||
                indiceContatoNaLista >= contatos.size()) return false;
        var c = contatos.get(indiceContatoNaLista);
       return c.addTelefone(rotulo, valor);

    }

    public boolean addEmail(String rotulo, String valor, int indiceContatoNaLista) {
        if (indiceContatoNaLista < 0 ||
                indiceContatoNaLista >= contatos.size()) return false;
        var c = contatos.get(indiceContatoNaLista);
       return c.addEmail(rotulo, valor);

    }
    public boolean updateTelefone(String rotulo, String valor, int indiceContatoNaLista) {
        if (indiceContatoNaLista < 0 ||
            indiceContatoNaLista >= contatos.size()) return false;
        var c = contatos.get(indiceContatoNaLista);
        return c.updateTelefone(rotulo,valor);
    }
    public boolean updateEmail(String rotulo, String valor, int indiceContatoNaLista) {
        if (indiceContatoNaLista < 0 ||
        indiceContatoNaLista >= contatos.size()) return false;
        var c = contatos.get(indiceContatoNaLista);
        return c.updateEmail(rotulo,valor);
    }
    public boolean removeTelefone(String rotulo, int indiceContatoNaLista) {
        if (indiceContatoNaLista < 0 ||
        indiceContatoNaLista >= contatos.size()) return false;
        var c = contatos.get(indiceContatoNaLista);
        return c.removeTelefone(rotulo);
    }

    public boolean removeEmail(String rotulo, int indiceContatoNaLista) {
        if (indiceContatoNaLista < 0 ||
        indiceContatoNaLista >= contatos.size()) return false;
        var c = contatos.get(indiceContatoNaLista);
        return c.removeEmail(rotulo);
    }

    @Override
    public String toString() {
        return contatos.toString();
    }
}