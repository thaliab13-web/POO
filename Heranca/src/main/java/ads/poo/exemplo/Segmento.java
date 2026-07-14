package ads.poo.exemplo;

public class Segmento {
    private boolean ligado;

    public Segmento() {
        // display começa desligado
        this.ligado = false;
    }

    // metodo pra ligar display
    public void ligar() {
        this.ligado = true;
    }

    // metodo pra desligar o segmento
    public void desligar() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }
}
