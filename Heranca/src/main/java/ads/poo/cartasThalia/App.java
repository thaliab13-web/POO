package ads.poo.cartasThalia;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;

public class App implements DrawListener {

    private Draw draw;

    private ArrayList<Elemento> elementos;

    public App() {
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200, 600);
        this.draw.setXscale(0, 1200);
        this.draw.setYscale(0, 600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.clear(Draw.BLUE);
        this.draw.addListener(this);

        this.elementos = new ArrayList<>();

        this.elementos.add(new CartaGrafica(Naipe.PAUS, Valor.DOIS,300,300));
        this.elementos.add(new DadoGrafico(100,400,123456));
        this.elementos.add(new DadoGrafico(200,400));

        // passe por todos os objetos da lista
        for (Elemento elemento : this.elementos) {
            // polimorfismo
            elemento.desenhar(this.draw);
        }
        this.draw.show();

    }

    @Override
    public void mouseClicked(double x, double y) {

        // passe por todos os objetos da lista
        for (Elemento elemento : this.elementos) {
            // polimorfismo
            if (elemento.clicouDentro(x,y)) {
                // polimorfismo
                elemento.desenhar(this.draw);
            }
        }
        this.draw.show();
    }

    static void main(String[] args) {
        App app = new App();
    }

}
