import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class CoracaoAmanda {

    static void main(String[] args) {

        Draw draw = new Draw();

        // tamanho da tela
        draw.setCanvasSize(800, 800);

        // escala
        draw.setXscale(0,800);
        draw.setYscale(0,800);

        // cor do coração
        draw.setPenColor(Color.RED);

        // circulo esquerdo
        draw.filledCircle(320, 500, 100);

        // circulo direito
        draw.filledCircle(480, 500, 100);

        // triangulo do coraçao
        double[] x = {220, 580, 400};
        double[] y = {500, 500, 250};

        draw.filledPolygon(x, y);

        // nome no coração
        draw.setPenColor(Color.WHITE);

        draw.setFontSize(40);

        draw.text(400, 420, "Amanda");

    }
}
