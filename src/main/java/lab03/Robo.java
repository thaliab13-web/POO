package lab03;

public class Robo {

    private String nome;
    private String cor;
    private static int contadorRobos = 0;
    private final int NUMERO_SERIE;

    public Robo(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
        contadorRobos++;
        this.NUMERO_SERIE = contadorRobos;
    }

    public String getNome() {
        return nome;
    }
    public int getNumeroSerie() {
        return NUMERO_SERIE;
    }

    // Total de robos criados
    public static int getTotalRobosCriados() {
        return contadorRobos;
    }

    public String toString() {
        return "nome" + nome + "n° serie" + NUMERO_SERIE;
    }

}
