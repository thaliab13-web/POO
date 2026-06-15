package ads.poo.exercicioGeometria2D;

public class Main {
    static void main(String[] args) {

        Linha linha = new Linha("Preta", 0, 0, 10, 10);

        Circulo circulo = new Circulo("Azul", new Ponto(5.3, 2.6), 3.1);

        Retangulo retangulo = new Retangulo("Vermelha", new Ponto(5.4, 7.1), new Ponto(2.3, 1.3));

        IO.println(linha.desenhar());

        IO.println(circulo.desenhar());
        IO.println("Área: " + circulo.area());
        IO.println("Perimetro: " + circulo.perimetro());

        IO.println(retangulo.desenhar());
        IO.println("Area: " + retangulo.area());
        IO.println("Perimetro: " + retangulo.perimetro());
    }




}
