package ads.poo.cartasThalia;


import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta implements Elemento {

    private int x;
    private int y;
    private boolean virada;

    public CartaGrafica(Naipe naipe, Valor valor, int x, int y, boolean virada) {
        super(naipe, valor);
        this.x = x;
        this.y = y;
        this.virada = virada;
    }

    // construtor sobrecarga
    public CartaGrafica(Naipe naipe, Valor valor, int x, int y) {
        this(naipe, valor, x, y, false);
    }

    // método da interface Elemento
    @Override
    public void desenhar(Draw draw) {
        String imagem;
        if (virada) {
            imagem = "cartas/" +  valor.inicial + naipe.inicial +".png";
        } else {
            imagem = "cartas/fundoa.png";
        }
        draw.picture(this.x, this.y, imagem);
    }


    // metodo da interface Elemento
    // verifica se a carta foi clicada, e se foi, altera seu estado de viarada
    @Override
    public boolean clicouDentro(double x, double y) {
        if ((x > this.x - 36 && x < this.x + 36) && (y > this.y - 48 && x < this.x + 48)) {
            virada = !virada;
            return true;
        }
        return false;
    }



}
