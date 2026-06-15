package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class DadoGui extends Dado implements Elemento{

    private int x;
    private int y;

    public DadoGui(int x, int y, int semente) {
        super(semente);
        this.x = x;
        this.y = y;

    }

    public DadoGui(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d){
        int f = this.face +1;
        String imagem = "dados/"+ f + ".png";
        d.picture(this.x,this.y,imagem);
    }

    @Override
    public boolean clicouDentro(double x, double y) {
        if ((x > this.x - 25 && x < this.x +25) &&
                (y > this.y - 25 && x < this.x + 25)){
            this.jogar();
                 return true;
        }
        return false;

    }
}
