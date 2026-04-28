package lab17;

import java.lang.reflect.Array;
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
    public ArrayList<Contato> findContato(String nome, String sobrenome) {
        ArrayList<Contato> encontrados = new ArrayList<>();

        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome) &&
            c.getSobrenome().equalsIgnoreCase(sobrenome));

            encontrados.add(c);
        }
        return encontrados;
    }




}
