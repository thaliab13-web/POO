package ads.poo.exercicioPersonagens;

public class Aldeao extends Personagem implements Guerreiro, Coletador {

    public Aldeao(int vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return "Aldeao atacando os inimigos";
    }

    @Override
    public String mover() {
        return "Aldeão tentou se defender";
    }

    @Override
    public String coletarMadeira() {
        return "Aldeao coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "Aldeao coletando ouro";
    }

    @Override
    public String toString() {
        return """
                Aldeao ->
                """ +
                super.toString();
    }
}