package aula16;

public class Motor {

    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor(int hp, int cilindros, int giroAtual) {
        this.hp = hp;
        this.cilindros = cilindros;
        this.giroAtual = giroAtual;
    }
    public void acelerar(int velocidade) {
        this.giroAtual += velocidade;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getGiroAtual() {
        return giroAtual;
    }

    public void setGiroAtual(int giroAtual) {
        this.giroAtual = giroAtual;
    }
}
