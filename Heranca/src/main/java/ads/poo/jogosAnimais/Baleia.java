package ads.poo.jogosAnimais;

public class Baleia extends Animal implements Nada, EsguichaAgua {

    public Baleia(String nome) {
        super(nome);
    }

    @Override
    public void nadar() {
        IO.println(nome + "nadando");
    }

    @Override
    public void esguicharAgua() {
        IO.println(nome + "esguichando água");
    }
}
