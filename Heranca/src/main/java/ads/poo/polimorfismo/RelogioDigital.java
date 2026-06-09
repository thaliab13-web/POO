package ads.poo.polimorfismo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class RelogioDigital {
    private int hora;
    private int minuto;
    private int segundo;
    private double x;
    private double y;
    private int tamanho;
    private Color cor;
    private Display7Segmentos[] displays = new Display7Segmentos[6];

    public RelogioDigital(double x, double y, Color cor, int tamanho, int hora, int minuto, int segundo) {
        this.x = x;
        this.y = y;
        this.cor = cor;

        // criando objetos displays
        for (int i = 0; i < displays.length; i++) {
            displays[i] = new Display7Segmentos();
        }

        // verificando o tamanho do relogio
        if (tamanho < 1 || tamanho > 3) {
            tamanho = 2;
        }
        switch (tamanho) {
            case 1:
                this.tamanho = 50;
            break;
            case 2:
                this.tamanho = 100;
                break;
            case 3:
                this.tamanho = 150;
                break;

        }

        // validador de horario
        if ((hora < 0 || hora > 23) || (minuto < 0 || minuto > 59) || (segundo < 0 || segundo > 59)) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public void atualizarHorario() {
        this.segundo++;

        if (this.segundo >= 60) {
            this.segundo = 0;
            this.minuto++;
        }
        if (this.minuto >= 60) {
            this.minuto = 0;
            this.hora++;
        }
        if (this.hora >= 24) {
            this.hora = 0;

        }
    }

    public void desenharHorario(Draw draw) {

        // Cor desliga, mesma cor com 20% do cor original
        float fatorEscuro = 0.2f;
        Color corDesliga = new Color (
                (int)(cor.getRed() * fatorEscuro),
                (int)(cor.getGreen() * fatorEscuro),
                (int)(cor.getBlue() * fatorEscuro)
        );

        // separa hora, minuto, e segundo em 6 digitps individuais
        int[] digitos = {
                hora / 10, hora % 10,
                minuto / 10, minuto  % 10,
                segundo / 10, segundo % 10
        };

        for (int i = 0; i < 6; i++) {
            double xDisplay = x + i * tamanho * 1.5;

            displays[i].exibirNumero(digitos[i]);

            displays[i].desenhar(draw, xDisplay, y, tamanho, cor, corDesliga);
        }

    }

    @Override
    public String toString() {
        return String.format("02d:%02d:%02d", hora, minuto, segundo);
    }
}

