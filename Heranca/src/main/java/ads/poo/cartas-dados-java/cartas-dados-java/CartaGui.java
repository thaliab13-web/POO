package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGui extends ads.poo.Carta implements Elemento{

    private int x;
    private int y;
    private boolean virada;

    public CartaGui(Naipe naipe, Valor valor, int x, int y, boolean virada) {
        super(naipe, valor);
        this.x = x;
        this.y = y;
        this.virada = virada;
    }

    public CartaGui(Naipe naipe, Valor valor, int x, int y) {
        this(naipe, valor, x, y, false);
    }

    public void desenhar(Draw d){
        String imagem = (virada) ? "cartas/"+valor.inicial+naipe.inicial+".png" : "cartas/fundoa.png";
        d.picture(this.x,this.y,imagem);
    }

    @Override
    public boolean clicouDentro(double x, double y) {

        if ((x > this.x - 36 && x < this.x +36) &&
        (y > this.y - 48 && x < this.x + 48)){
            virada = !virada;
            return true;
        }
        return false;

    }
}
