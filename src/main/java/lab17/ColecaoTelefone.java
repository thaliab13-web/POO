package lab17;

import java.util.HashMap;

public class ColecaoTelefone {
    private HashMap<String, String> dados = new HashMap<>();


    public boolean add(String rotulo, String valor) {
        if(dados.containsKey(rotulo)) return false;
        dados.put(rotulo, valor);
        return true;
        //se a chave rotulo já existe ele return false
        // se não ele adiciona o rotulo e valor e retorn true
    }

//    public boolean remove(String rotulo) {
//        // oq foi retornado é diferente de null?
//        return dados.remove(rotulo) != null;
//    } ou

    // remove e ve se deu certo
    public boolean remove(String rotulo) {
       String valor = dados.remove(rotulo);

       if (valor != null) {
           return true;
       } else {
           return false;
       }
    }

    public boolean update(String rotulo, String valor) {
        if (!dados.containsKey(rotulo)) return false;
        dados.put(rotulo, valor);
        return true;
    }

    public String toString() {
         return dados.toString();
    }
}
