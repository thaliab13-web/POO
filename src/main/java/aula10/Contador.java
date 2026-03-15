package aula10;

public class Contador {

    // Atributo
    public int valorAtual;

    // Métodos
    public Contador() {
        valorAtual = 0;
    }

    public void atribuirValor(int valor) {
        valorAtual = valor;
    }

    public void incrementar() {
        valorAtual++;
    }

    // Método para retornar o valor atual
    public int getValorAtual() {
        return valorAtual;
    }


}
