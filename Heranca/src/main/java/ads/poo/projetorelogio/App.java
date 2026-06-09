package ads.poo.projetorelogio;
import edu.princeton.cs.algs4.Draw;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class App {
    static void main(String[] args) throws Exception {

        Draw draw = new Draw();
        draw.setCanvasSize(800, 600);
        draw.setXscale(0, 800);
        draw.setYscale(0, 600);
        draw.enableDoubleBuffering();


        ArrayList<Relogio> relogios = new ArrayList<>();

       relogios.add(new RelogioTexto(10, 20, 30, 200, 500, ModoRelogio.NORMAL));

        relogios.add(new RelogioAnalogico(8, 10, 50, 400, 300));

        relogios.add(new Relogio7Segmentos(0,0,0,600,500, ModoRelogio.CRONOMETRO_PROGRESSIVO));

        while (true) {

            draw.clear();

            for (Relogio r : relogios) {

                r.atualizar();

                r.desenhar(draw);
            }
            draw.show();
            TimeUnit.SECONDS.sleep(1);
        }


    }
    
}
