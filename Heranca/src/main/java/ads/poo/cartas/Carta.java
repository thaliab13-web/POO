package ads.poo.cartas;

import edu.princeton.cs.algs4.Draw;

public class Carta {
    private Naipe naipe;
    private Valor valor;

    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }


    public void desenhar(Draw draw) {
        draw.picture(1,1, "imagem");
        draw.show();

    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}
