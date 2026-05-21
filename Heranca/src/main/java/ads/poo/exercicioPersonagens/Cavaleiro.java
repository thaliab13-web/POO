package ads.poo.exercicioPersonagens;

public class Cavaleiro extends Personagem implements Guerreiro{
    private boolean cavalgando;

    public Cavaleiro(int vida, double ataque, double velocidade, boolean cavalgando) {
        super(vida, ataque, velocidade);
        this.cavalgando = cavalgando;
    }

    @Override
    public String mover() {
        if (cavalgando) {
            return "Cavaleiro cavalgou rapidamente";
        }
        return "Cavaleiro caminhou";
    }

    @Override
    public String atacar() {
        return "Cavaleiro realizou um ataque pesado";
    }
    @Override
    public String toString() {
        return """
                Cavaleiro -> 
                """ +
                super.toString() +
                "Cavalgando:  " + cavalgando + "\n";

    };
}