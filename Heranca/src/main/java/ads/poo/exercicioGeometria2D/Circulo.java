package ads.poo.exercicioGeometria2D;

public class Circulo extends ObjetoDeDesenho implements FormaGeometrica{
    private Ponto centro;
    private double raio;

    public Circulo(String corDaLinha, Ponto centro, double raio) {
        super(corDaLinha);
        this.centro = centro;
        this.raio = raio;
    }

    @Override
    public String desenhar() {
        return "Desenhando circulo";
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
