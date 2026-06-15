package ads.poo.jogosAnimais;

public class Cachorro extends Animal implements Late, Fareja{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void latir() {
        IO.println(nome + "latindo");
    }

    @Override
    public void farejar() {
        IO.println(nome + "farejando");
    }
}
