package ads.poo.refazendoPersonagens;

public class Cavaleiro extends Personagem {

    public Cavaleiro() {
        super(12, 5, 1.7);
    }

    @Override
    public String mover() {
        return "Pulando...";
    }

    @Override
    public String atacar() {
        return "Atacandoo...";
    }
}
