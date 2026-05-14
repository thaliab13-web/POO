package ads.poo.pacote;

import java.util.StringJoiner;

public class Dimensao {
    private double altura;
    private double largura;
    private double profundidade;

    public Dimensao(double largura, double profundidade, double altura) {
        this.largura = largura;
        this.profundidade = profundidade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Dimensao.class.getSimpleName() + "[", "]")
                .add("altura=" + altura)
                .add("largura=" + largura)
                .add("profundidade=" + profundidade)
                .toString();
    }
}
