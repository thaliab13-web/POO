import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main(String[] args) throws Exception {

        // cria a area de desenho
        Draw draw = new Draw();

        // tamanho da janela
        draw.setCanvasSize(1000, 1000);

        // escala da tela
        draw.setXscale(0, 1000);
        draw.setYscale(0, 1000);

        // evitar piscar a tela
        draw.enableDoubleBuffering();

        // cria o relogio
        RelogioDigital relogio = new RelogioDigital(100, 500);

        while (true) {

            // limoar a tela
            draw.clear(Color.BLACK);

            // desenha o relogio
            relogio.desenhar(draw);

            // atualiza o tempo
            relogio.atualizar();

            //mostra na tela
            draw.show();

            // espera 1 segundo
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
