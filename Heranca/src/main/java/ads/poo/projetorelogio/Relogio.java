package ads.poo.projetorelogio;
import edu.princeton.cs.algs4.Draw;

public abstract class Relogio implements Desenhavel, Atualizavel {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public void setHorario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public int getSegundo() {
        return segundo;
    }

    protected void avancarSegundo() {
        segundo++;

        if (segundo >= 60) {
            segundo = 0;
            minuto++;

            if (minuto >= 60) {
                minuto = 0;
                hora++;

                if (hora >= 24) {
                    hora = 0;
                }
            }
        }

    }
     @Override
    public void atualizar() {
        avancarSegundo();
     }

     @Override
    public abstract void desenhar(Draw draw);
}
