package exemplosCasa;

public class Cofrinho {

    // Atributos
    private double valorGuardado;
    private boolean quebrado;

    // método retorna mensagem
    public String colocarMoeda(double valor) {
        if(quebrado) {
           return "Cofrinho quebrado";
        }
            // cofrinho recebe moeda
            valorGuardado += valor;
            return "Moeda colocada!";

    }

    // Aqui método precisa devolver o valor, então NÃO pode ser void, retorno ele no main
    public double getValorGuardado() {
        // cofrinho responde quanto tem
        return valorGuardado;
    }

    // Aqui método só muda o estado do objeto, não devolve valor
    public void quebrarCofrinho() {
        if(quebrado) {
            IO.println("O cofrinho já está quebrado");
        } else {
            quebrado = true;
        }

    }

    // método para mostra o estado do cofrinho
    public boolean getQuebrado() {
        // Cofrinho, vc está quebrado?
        return quebrado;
    }


}
