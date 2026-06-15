package ads.poo;

import java.util.Random;

public class Dado {
    protected int face;
    protected int[] estatisticas;
    private Random r;

    public Dado(int semente){
        this();
        this.r = new Random(semente);
    }

    public Dado() {
        this.face = 1;
        this.estatisticas = new int[6]; // 0 a 5
        this.r = new Random();
    }

    public int jogar(){
        this.face = r.nextInt(6); // 0 a 5
        this.estatisticas[this.face]++;
        return (this.face+1);
    }

}
