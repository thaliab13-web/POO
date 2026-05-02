package aula17;

import java.util.HashMap;

public class ColecaoEmail {

    // criando uma coleção para guarda os rotulos e valor (chave e valor)
    private HashMap<String, String> dados = new HashMap<>();

    // Constante, regra FIXA pra validar todos emails
    private static final String REGEX_EMAIL = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    // método para validar email
    private boolean validarEmail(String email) {
        // testa se o email segue a regra
        return email.matches(REGEX_EMAIL);
    }

    // retorna boolean indica se conseguiu add ou não
    // método para adicionar rotulo(casa, comercial) e valor(larat@gmail.com) no email
    public boolean add(String rotulo, String valor) {
      // validar email primeiro, valor = email
        if(!validarEmail(valor)) return false;

        // impede sobrescrever
        if (dados.containsKey(rotulo)) return false; // já existe

        // se o rotulo não existir ele adiciona no HashMap
        dados.put(rotulo, valor);
        return true;
    }
    // remove e a chave do elemento do HashMap, e retorna o valor que esta associado a ela
        public boolean remove(String rotulo) {
        // se removeu retorna true
            // se não existir a chave retorna false
           return dados.remove(rotulo) != null;
        }

        // método para atualizar o contatoEmail
    public boolean update(String rotulo, String valor) {
        // só atualiza se existir
        if(!dados.containsKey(rotulo)) return false;

        // valida o novo email, valor = email
        if(!validarEmail(valor)) return false;

        // HashMap substitui o valor antigo, Se Já existir
        dados.put(rotulo, valor);
        return true;
    }

    // MOstra todos os emails guardados no formato {rotulo=email}
    public String toString() {
        // {chave1=valor1, chave2=valor2, chave3=valor3}
        return dados.toString();
    }

}
