package ads.poo.jogosAnimais;

public class Avestruz extends Animal implements Corre, Bica {

    public Avestruz(String nome) {
        super(nome);
    }

    @Override
    public void correr() {
        IO.println(nome + "correndo");
    }

    @Override
    public void bicar() {
        IO.println(nome + "bicando");
    }
}
