import edu.princeton.cs.algs4.Draw;

public class RelogioDigital {

    private int horas;
    private int minutos;
    private int segundos;

    //posição do relógio na tela
    private int x;
    private int y;

    public RelogioDigital(int x, int y) {

        this.x = x;
        this.y = y;

        // horario inicial
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    // atualiza o relogio
    public void atualizar() {

        // soma 1 segundo
        segundos++;

        // verificando se chegou em 60s
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        // chegou em 60min
        if (minutos == 60) {
            minutos = 0;
            horas++;
        }

        // chegou em 24h
        if (horas == 24) {
            horas = 0;
        }
    }

    // desenha o relogio
    public void desenhar(Draw draw) {

        // separa os digitos das horas
        int h1 = horas / 10;
        int h1 = horas % 10;

        // separa digitos dps minutos
        int m1 = minutos / 10;
        int m2 = minutos % 10;
    }

}
