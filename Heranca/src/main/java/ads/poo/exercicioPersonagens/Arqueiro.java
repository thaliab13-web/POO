package ads.poo.exercicioPersonagens;

public class Arqueiro extends Personagem{
    private int qtdFlexa;

    public Arqueiro(int vida, double ataque, double velocidade, int qtdFlexa) {
        super(vida, ataque, velocidade);
        this.qtdFlexa = qtdFlexa;
    }

    public String mover() {
        return "Alqueiro movendo seu arco e flecha";
    }
    public String atacar() {
        return "Alqueiro esta lacando sua flecha";
    }
    @Override
    public String toString() {
        return "Alqueiro -> " +
                super.toString() +
                "Quantidade de Flexa: " + qtdFlexa;
    }


}