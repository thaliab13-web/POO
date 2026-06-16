package ads.poo.cartasThalia;

import edu.princeton.cs.algs4.Draw;

public interface Elemento {

    void desenhar(Draw draw);
    boolean clicouDentro(double x, double y);
}
