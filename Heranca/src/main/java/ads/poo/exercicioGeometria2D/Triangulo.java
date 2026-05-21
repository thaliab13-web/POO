package ads.poo.exercicioGeometria2D;

public class Triangulo extends ObjetoDeDesenho implements FormaGeometrica {
    private Ponto v1;
    private Ponto v2;
    private Ponto v3;

    public Triangulo(String corDaLinha, Ponto v1, Ponto v3, Ponto v2) {
        super(corDaLinha);
        this.v1 = v1;
        this.v3 = v3;
        this.v2 = v2;
    }

    @Override
    public String desenhar() {
        return "Desenhando triangulo";
    }


    @Override
    public double perimetro() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}
