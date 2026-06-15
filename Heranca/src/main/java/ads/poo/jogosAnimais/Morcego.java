package ads.poo.jogosAnimais;

public class Morcego extends Animal implements Voa, EmiteUltrassom {

    public Morcego(String nome) {
        super(nome);
    }

    @Override
    public void voar() {
        IO.println(nome + "voando");
    }

    @Override
    public void emitirUltrassom() {
        IO.println(nome + "  emitem ultrassom");
    }
}
