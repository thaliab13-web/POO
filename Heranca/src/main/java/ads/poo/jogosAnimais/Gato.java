package ads.poo.jogosAnimais;

public class Gato extends Animal implements Corre, Mia {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void correr() {
        IO.println(nome + " correndo");
    }

    @Override
    public void miar() {
        IO.println(nome + " miando");
    }
}
