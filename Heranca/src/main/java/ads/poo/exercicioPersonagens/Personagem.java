package ads.poo.exercicioPersonagens;

public abstract class Personagem {

    protected int vida;
    protected double ataque;
    protected double velocidade;

    public Personagem(int vida, double ataque, double velocidade){
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    // metodo abstrato, toda classe que herda deve sobrescrever esses metodo
    public abstract String mover();


    @Override
    public String toString() {
        return String.format(
                """
                
                Vida: %d
                Ataque: %.2f
                Velocidade: %.2f
                """,
                vida,
                ataque,
                velocidade
        );
    }

}