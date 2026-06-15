package ads.poo.jogosAnimais;

public class Lobo extends Animal implements Corre, Cacar {

    public Lobo(String nome) {
        super(nome);
    }

    @Override
    public void correr() {
        IO.println(nome + "correndo");
    }

    @Override
    public void cacar() {
        IO.println(nome + " caçando");
    }
}
