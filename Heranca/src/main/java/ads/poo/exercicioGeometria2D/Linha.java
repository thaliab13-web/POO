package ads.poo.exercicioGeometria2D;

public class Linha extends ObjetoDeDesenho {
    private Ponto inicio;
    private Ponto fim;


    public Linha(String corDaLinha, Ponto fim, Ponto inicio) {
        super(corDaLinha);
        this.fim = fim;
        this.inicio = inicio;
    }

    @Override
    public String desenhar() {
        return "Desenhando linha";
    }
}
