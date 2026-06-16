package ads.poo.cartasThalia;

import edu.princeton.cs.algs4.Draw;

public class Carta {
    protected Naipe naipe;
    protected Valor valor;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }
}
