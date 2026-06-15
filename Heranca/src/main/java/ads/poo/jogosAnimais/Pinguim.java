package ads.poo.jogosAnimais;

public class Pinguim extends Animal implements Nada, Corre{

    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public void nadar() {
        IO.println(nome + "nadando");
    }

    @Override
    public void correr() {
        IO.println(nome + " correndo");
    }
}
