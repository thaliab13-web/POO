package ads.poo.projetorelogio;

import edu.princeton.cs.algs4.Draw;

public class Relogio7Segmentos extends RelogioDigital {
    private double x;
    private double y;

    public Relogio7Segmentos(int hora, int minuto, int segundo,double x, double y, ModoRelogio modo) {
        super(hora, minuto, segundo, modo);
        this.x = x;
        this.y = y;
    }

    @Override
    public void desenhar(Draw draw) {
        String texto = String.format(
                "%02d:%02d:%02d",
                hora,
                minuto,
                segundo
        );
        draw.text(x, y, "[ " + texto + "]");
    }
}
