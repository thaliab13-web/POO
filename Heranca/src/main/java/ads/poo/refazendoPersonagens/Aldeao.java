package ads.poo.refazendoPersonagens;

public class Aldeao extends Personagem{

    public Aldeao() {
        super(33, 9, 3.2);
    }

    @Override
    public String mover() {
        return "Andando...";
    }

    @Override
    public String atacar() {
        return "Porradaria...";
    }

}
