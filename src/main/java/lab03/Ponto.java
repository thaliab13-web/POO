package lab03;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return String.format("(%.2f,%.2f)", x, y);
    }

    public double getDistancia(Ponto p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.x - p.x, 2));
    }
}