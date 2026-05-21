package ads.poo.exercicioPersonagens;

public class Arqueiro extends Personagem implements Guerreiro{

    private int qtdFlexa;

    public Arqueiro(int vida, double ataque, double velocidade, int qtdFlexa) {
        super(vida, ataque, velocidade);
        this.qtdFlexa = qtdFlexa;
    }

    @Override
    public String atacar() {
        return "Arqueiro disparou uma flecha. Flechas restantes: " + qtdFlexa;
    }

    @Override
    public String mover() {
        return "Arqueiro se escondeu";
    }

    @Override
    public String toString() {
        return """
                Arqueiro -> 
                """ +
                super.toString();
    }


}