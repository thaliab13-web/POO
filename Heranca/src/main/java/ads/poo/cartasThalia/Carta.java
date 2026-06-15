package ads.poo.cartasThalia;

import edu.princeton.cs.algs4.Draw;

public class Carta {
    private Naipe naipe;
    private Valor valor;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Valor getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
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
