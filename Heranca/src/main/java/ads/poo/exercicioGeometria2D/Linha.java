package ads.poo.exercicioGeometria2D;

public class Linha extends ObjetoDeDesenho {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Linha(String corDaLinha, int x1, int y1, int x2, int y2) {
        super(corDaLinha);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public String desenhar() {
        return "Linha [cor=" + corDaLinha +
                ", ponto1=(" + x1 + "," + y1 +")" +
                ", ponto2=(" + x2 + "," + y2 + ")]";
    }
}
