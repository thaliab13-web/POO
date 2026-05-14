/* maven repositoy - conteḿ várias bibliotecas */

import java.awt.Color;
import java.util.concurrent.TimeUnit;

import edu.princeton.cs.algs4.Draw;

public class App {
    static void main(String[] args) throws InterruptedException {

        Draw draw = new Draw();

        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);
        draw.circle(400,400,100);
        draw.enableDoubleBuffering();


       /*
        draw.filledCircle(400,400,50);
        double[] x = {100,150,250,300};
        double[] y = {100,150,150,100};
        draw.filledPolygon(x,y);
       */ 

           draw.setPenColor(Color.LIGHT_GRAY);


           for (int i = 0; i < 800; i+=5) {
            draw.line(i, 0, i, 800);
            draw.line(0, i, 800, i);
           }

    draw.show();

    draw.setFontSize(30);

    
    for (int i = 0; i < 10; i++) {
        draw.text(400,400, "" + i);
        draw.show();
        TimeUnit.SECONDS.sleep(1);

    }
    }
}