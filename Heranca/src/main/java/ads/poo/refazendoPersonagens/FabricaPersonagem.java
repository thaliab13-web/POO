package ads.poo.refazendoPersonagens;

public class FabricaPersonagem {

    public static Personagem criar(TipoPersonagem tipo) throws  TipoInvalidoException{

        switch (tipo) {
            case ALDEAO:
                return new Aldeao();
            case ARQUEIRO:
                return new Arqueiro();
            case CAVALEIRO:
                return new Cavaleiro();

            default:
                throw new TipoInvalidoException("Tipo inválido");
        }


    }
}
