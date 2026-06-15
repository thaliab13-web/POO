package ads.poo.jogosAnimais;

public class Arara extends Animal implements Voa, ImitaSom {

    public Arara(String nome) {
        super(nome);
    }

    @Override
    public void voar() {
        IO.println(nome + "voando");
    }

    @Override
    public void imitarSom() {
        IO.println(nome + "imitando o som");
    }
}
