package ads.poo.exercicioGeometria2D;

public class Retangulo extends ObjetoDeDesenho implements FormaGeometrica {
    private Ponto verticeL;
    private Ponto verticeF;

    public Retangulo(String corDaLinha, Ponto verticeF, Ponto verticeL) {
        super(corDaLinha);
        this.verticeF = verticeF;
        this.verticeL = verticeL;
    }

    @Override
    public String desenhar() {
        return "Desenhando Retangulo";
    }

    @Override
    public double area() {

       double base =
               Math.abs(verticeF.getX() - verticeL.getX());
       double altura =
               Math.abs(verticeF.getY() - verticeL.getY());
        return base * altura;
    }

    @Override
    public double perimetro() {
        double base =
                Math.abs(verticeF.getX() - verticeL.getX());
        double altura =
                Math.abs(verticeF.getY() - verticeL.getY());
        return 2 * (base + altura);
    }
}
