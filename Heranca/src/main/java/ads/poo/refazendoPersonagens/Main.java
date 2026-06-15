package ads.poo.refazendoPersonagens;

public class Main {

     static void main(String[] args) {

        try {
            Personagem p1 = FabricaPersonagem.criar(TipoPersonagem.CAVALEIRO);

            Personagem p2 = FabricaPersonagem.criar(TipoPersonagem.ALDEAO);

            Personagem p3 = FabricaPersonagem.criar(TipoPersonagem.ARQUEIRO);

            Personagem[] personagens = {p1, p2, p3};

            for (Personagem p : personagens) {
                IO.println(p.mover());
                IO.println(p.atacar());
                IO.println();
            }
        } catch (TipoInvalidoException e) {
            IO.println(e.getMessage());
        }


    }
}
