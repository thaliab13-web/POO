package ads.poo.jogosAnimais;

public class Macaco extends Animal implements Corre, Fala {

    public Macaco(String nome) {
        super(nome);
    }

    @Override
    public void correr() {
        IO.println(nome + "correndo");
    }

    @Override
    public void falar() {
        IO.println(nome + "falando");
    }
}
