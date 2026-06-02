package ads.poo.projetorelogio;
import edu.princeton.cs.algs4.Draw;

public abstract class RelogioDigital extends Relogio {

    protected ModoRelogio modo;

    public RelogioDigital(int hora, int minuto, int segundo,  ModoRelogio modo) {
        super(hora, minuto, segundo);
        this.modo = modo;
    }
    @Override
    public void atualizar() {
        switch (modo) {
            case NORMAL:
            case CRONOMETRO_PROGRESSIVO:
                avancarSegundo();
                break;
            case CRONOMETRO_REGRESSIVO:
                regressivo();
                break;
        }
    }
    private void regressivo() {

        if (hora == 0 && minuto == 0 && segundo == 0) {
            return;
        }
        segundo--;

        if (segundo < 0) {
            segundo = 59;
            minuto--;

            if (minuto < 0) {
                minuto = 59;
                hora--;
            }
        }
    }

    
}
