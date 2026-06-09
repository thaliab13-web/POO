package ads.poo.polimorfismo;


import ads.poo.projetorelogio.Relogio;
import edu.princeton.cs.algs4.Draw;

import java.util.concurrent.TimeUnit;

public class App {
    static void main(String[] args) throws Exception {

        Draw draw = new Draw();
        draw.setCanvasSize(1000, 1000);
        draw.setXscale(0, 1000);
        draw.setYscale(0, 1000);
        draw.enableDoubleBuffering();

        // cria o reloogio
        RelogioDigital relogio = new RelogioDigital(50, 400, Draw.GREEN, 2,7,0,30);

        // loop eterno a cada segundo, limoa a redesenha
        while(true) {
            draw.clear(Draw.BLACK); // apaga tudo
            relogio.desenharHorario(draw); // desenha o horario atual
            draw.show(); // exibe na tela

            TimeUnit.SECONDS.sleep(1); // espera 1 minuto

            relogio.atualizarHorario(); // avança o tempo
        }

    }


}
