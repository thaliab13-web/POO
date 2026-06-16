package ads.poo.cartasThalia;

import java.util.Random;

public class Dado {
    protected int face;
    protected int[] estatisticas; // conta quantas vezes a face saiu
    private Random random;

    public Dado(int semente) {
        this();
        this.random = new Random(semente);
    }

    public Dado() {
        this.face = 1;
        this.estatisticas = new int[6]; // 0 a 5
        this.random = new Random();
    }

    public int jogar() {
        this.face = random.nextInt(6); //0 a 5
        this.estatisticas[this.face]++;
        return (this.face+1);
    }

}
