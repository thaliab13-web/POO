package ads.poo.cartasThalia;

import edu.princeton.cs.algs4.Draw;

public class DadoGrafico extends Dado implements Elemento {

    private int x;
    private int y;

    public DadoGrafico(int x, int y, int semente) {
        super(semente);
        this.x = x;
        this.y = y;
    }

    public DadoGrafico(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw draw) {
        int f = this.face + 1;
        String imagem = "dados/" + f + ".png";
        draw.picture(this.x, this.y, imagem);
    }

    @Override
    public boolean clicouDentro(double x, double y) {
        if ((x > this.x - 25 && x < this.x + 25) && (y > this.y - 25 && x < this.x + 25)) {
            this.jogar();
            return true;
        }
        return false;
    }
}
