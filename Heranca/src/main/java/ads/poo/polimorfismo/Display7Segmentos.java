package ads.poo.polimorfismo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Display7Segmentos {


    private Segmento[] segmentos = new Segmento[7];

    public Display7Segmentos() {


        for (int i = 0; i < segmentos.length; i++) {
            segmentos[i] = new Segmento();
        }

    }

    public void exibirNumero(int numero) {
        for (Segmento s : segmentos) {
            s.desligar();
        }
        switch (numero) {
            case 0:
                segmentos[0].ligar();//A
                segmentos[1].ligar();//B
                segmentos[2].ligar();//C
                segmentos[3].ligar();//D
                segmentos[4].ligar();//E
                segmentos[5].ligar();//F

            break;
            case 1:
                segmentos[1].ligar();//B
                segmentos[2].ligar();//C
            break;

            case 2:
                segmentos[0].ligar();//A
                segmentos[1].ligar();//B
                segmentos[3].ligar();//D
                segmentos[4].ligar();//E
                segmentos[6].ligar();//G
            break;

            case 3:
                segmentos[0].ligar();//A
                segmentos[1].ligar();//B
                segmentos[2].ligar();//C
                segmentos[3].ligar();//D
                segmentos[6].ligar();//G
            break;

            case 4:
                segmentos[1].ligar();//B
                segmentos[2].ligar();//C
                segmentos[5].ligar();//F
                segmentos[6].ligar();//G
            break;

            case 5:
                segmentos[0].ligar();//A
                segmentos[2].ligar();//C
                segmentos[3].ligar();//D
                segmentos[5].ligar();//F
                segmentos[6].ligar();//G
            break;

            case 6:
                segmentos[0].ligar();//A
                segmentos[2].ligar();//C
                segmentos[3].ligar();//D
                segmentos[4].ligar();//E
                segmentos[5].ligar();//F
                segmentos[6].ligar();//G
            break;
            case 7:
                segmentos[0].ligar();//A
                segmentos[1].ligar();//B
                segmentos[2].ligar();//C
            break;

            case 8:
                segmentos[0].ligar();//A
                segmentos[1].ligar();//B
                segmentos[2].ligar();//C
                segmentos[3].ligar();//D
                segmentos[4].ligar();//E
                segmentos[5].ligar();//F
                segmentos[6].ligar();//G
            break;

            case 9:
                segmentos[0].ligar();//A
                segmentos[1].ligar();//B
                segmentos[2].ligar();//C
                segmentos[3].ligar();//D
                segmentos[5].ligar();//F
                segmentos[6].ligar();//G
            break;
            default:
            break;
        }
    }

    // desenha o display na tela
    public void desenhar(Draw draw, double x, double y, double tamanho, Color corLigado, Color corDesligado) {

        // A - horizontal TOPO
         desenharHorizontal(draw, x, y, 2*tamanho, segmentos[0].isLigado() ? corLigado : corDesligado);

         // B - vertical Superior direito
        desenharVertical(draw, x + tamanho, y + tamanho, tamanho, segmentos[1].isLigado() ? corLigado : corDesligado);

        // C - vertical Inferior direito
        desenharVertical(draw, x + tamanho, y, tamanho, segmentos[2].isLigado() ? corLigado : corDesligado);

        // D - horizontal Baixo
        desenharHorizontal(draw, x, y, tamanho, segmentos[3].isLigado() ? corLigado : corDesligado);

        // E - vertical Superior esquerdo
        desenharVertical(draw, x, y, tamanho, segmentos[4].isLigado() ? corLigado : corDesligado);

        // F - vertical Superior esquerdo
        desenharVertical(draw, x, y + tamanho, tamanho, segmentos[5].isLigado() ? corLigado : corDesligado);

        // G - horizontal Meio
        desenharHorizontal(draw, x, y + tamanho, tamanho, segmentos[6].isLigado() ? corLigado : corDesligado);
    }

    // Poligono horizontal (segmentos A, D,G)
    private void desenharHorizontal(Draw draw, double x, double y, double t, Color cor) {
        double[] xs = {0.1*t+x, 0.2*t+x, 1.0*t+x, 1.1*t+x,  1.0*t+x, 0.2*t+x};
        double[] ys = {0.2*t+y, 0.3*t+y, 0.3*t+y, 0.2*t+y, 0.1*t+y, 0.1*t+y};
        draw.setPenColor(cor);
        draw.filledPolygon(xs, ys);
    }

    // Poligono vertical (segmentos B,C,E,F)
    private void desenharVertical(Draw draw, double x, double y, double t, Color cor) {
        double[] xs = {0.1*t+x, 0.2*t+x, 0.2*t+x, 0.1*t+x,  0.0*t+x, 0.0*t+x};
        double[] ys = {0.2*t+y, 0.3*t+y, 1.0*t+y, 1.1*t+y, 1.0*t+y, 0.3*t+y};
        draw.setPenColor(cor);
        draw.filledPolygon(xs, ys);
    }

}
