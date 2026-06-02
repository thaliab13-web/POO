package ads.poo.projetorelogio;
import edu.princeton.cs.algs4.Draw;

public class RelogioAnalogico extends Relogio {

    private double x;
    private double y;

    public RelogioAnalogico(int hora, int minuto, int segundo, double x, double y) {
        super(hora, minuto, segundo);
        this.x = x;
        this.y = y;
    }

    @Override
    public void desenhar(Draw draw) {

        draw.circle(x, y, 100);

        double anguloHora = Math.toRadians(hora * 30);

        double anguloMinuto = Math.toRadians(minuto * 6);

        double anguloSegundo = Math.toRadians(segundo * 6);
    }

  
    
}
