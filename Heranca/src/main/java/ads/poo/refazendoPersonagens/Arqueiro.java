package ads.poo.refazendoPersonagens;

public class Arqueiro extends Personagem{

    public Arqueiro() {
        super(23, 3, 6.1);
    }
    @Override
    public String mover() {
        return "Correndo rápido...";
    }

    @Override
    public String atacar() {
        return "Socar...";
    }

}
