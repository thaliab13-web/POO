package lab17;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    // adicionando contatos a lista
    public void adicionarContato(Contato c) {

        contatos.add(c); // adiciona o contato atual na lista
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


}
