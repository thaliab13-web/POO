package ads.poo.jogosAnimais;

public class Ornitorrinco extends Animal implements Corre, Nada {

    public Ornitorrinco(String nome) {
        super(nome);
    }

    @Override
    public void correr() {
        IO.println(nome + "correndo");
    }

    @Override
    public void nadar() {
        IO.println(nome + "nadando");
    }
}
