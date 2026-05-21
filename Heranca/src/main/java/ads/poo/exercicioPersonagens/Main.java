package ads.poo.exercicioPersonagens;

public class Main {
    public static void main(String[] args) {

        Arqueiro arqueiro = new Arqueiro(32,2,3,7);
        Cavaleiro cavaleiro = new Cavaleiro(50, 3, 2, true);
        Aldeao aldeao = new Aldeao(25, 2, 1);


        Personagem[] vetor = new Personagem[3];
        vetor[0] = aldeao;
        vetor[1] = cavaleiro;
        vetor[2] = arqueiro;

        for (Personagem aux : vetor) {

            IO.println(aux);
            IO.println(aux.mover());

            if (aux instanceof Guerreiro guerreiro) {
                IO.println(guerreiro.atacar());
            }
            IO.println("------------------------------------");
        }



    }
}