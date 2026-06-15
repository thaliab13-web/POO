package ads.poo.jogosAnimais;

public class Leao extends Animal implements Cacar, Corre{

    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void cacar() {
        IO.println(nome + "caçando");
    }

    @Override
    public void correr() {
        IO.println(nome + "correndo");
    }
}
