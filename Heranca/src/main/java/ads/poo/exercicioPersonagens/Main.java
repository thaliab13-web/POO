package ads.poo.exercicioPersonagens;

public class Main {
    public static void main(String[] args) {

        Arqueiro arqueiro = new Arqueiro(32,2,3,7);
        Cavaleiro cavaleiro = new Cavaleiro(50, 3, 2, false);
        Aldeao aldeao = new Aldeao(25, 2, 1, "Lenhador");
        Personagem personagem = new Personagem(25, 1, 3.4);


        Personagem[] vetor = new Personagem[3];
        vetor[0] = aldeao;
        vetor[1] = cavaleiro;
        vetor[2] = arqueiro;

        for (Personagem aux : vetor) {
            IO.println(aux.atacar());
            IO.println(aux.mover());
        }



    }
}