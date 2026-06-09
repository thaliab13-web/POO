package ads.poo.polimorfismo;

public class Segmento {
    private boolean ligado;

    public Segmento() {
        ligado = false;
    }

    public void ligar() {
         ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }


}
