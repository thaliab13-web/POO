package aula16;

public class MotorCarro {

    private int hp;
    private int giroAtual;
    private int cilindros;

    // construtor, inicializando os atributos
    public MotorCarro() {
        this.hp = 144;
        this.cilindros = 5;
        this.giroAtual = 0;
    }
    public void acelerar(int velocidade) {
        this.giroAtual += velocidade;
        IO.println("Motor agora está com giro: " + giroAtual);
    }
}
