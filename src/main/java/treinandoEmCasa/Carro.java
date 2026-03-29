package treinandoEmCasa;

public class Carro {

    /* Atributos */
    private String modelo;
    private int velocidadeMaxima;
    private int velocidadeAtual;

    public Carro(String modelo, int velocidadeMaxima) {

        /* atributo = valor recebido */
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    /* Valor constante não muda o valor */
    private static final int VELOCIDADE_MAXIMA_MODELOS = 300;

    private static final int VELOCIDADE_MINIMA = 0;

    /* Construtor com apenas modelo */

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeMaxima = VELOCIDADE_MAXIMA_MODELOS;
    }

    public void acelerar(int i) {
        velocidadeAtual = (velocidadeAtual+i < velocidadeMaxima) ? velocidadeAtual+i : velocidadeMaxima;
        // resultado = (condicao) ? valorSeVerdadeiro : valorSeFalso;
    }

    public void frear(int d) {
        velocidadeAtual = (velocidadeAtual-d > VELOCIDADE_MINIMA) ? velocidadeAtual-d : VELOCIDADE_MINIMA;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

}
