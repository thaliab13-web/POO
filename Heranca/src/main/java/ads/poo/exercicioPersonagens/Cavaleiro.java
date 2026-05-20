package ads.poo.exercicioPersonagens;

public class Cavaleiro extends Personagem{
    private boolean cavalgando;

    public Cavaleiro(int vida, double ataque, double velocidade, boolean cavalgando) {
        super(vida, ataque, velocidade);
        this.cavalgando = false;
    }
    public String mover() {
        return "Cavaleiro montou no cavalo";
    }
    public String atacar() {
        return "Cavaleiro atacou com sua lanca";
    }
    public String toString() {
        return "Cavaleiro " +
                super.toString() +
                "Cavalgando:  " + cavalgando;

    };
}