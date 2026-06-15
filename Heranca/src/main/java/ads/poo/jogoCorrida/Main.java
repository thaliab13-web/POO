package ads.poo.jogoCorrida;

public class Main {

    static void main(String[] args) {

        Jeep jeep = new Jeep("Preto", "10WA");

    Fusca fusca = new Fusca("Azul", "tppp");
        IO.println();
        IO.println(jeep.ligar());
        IO.println(jeep.acelerar());
        IO.println(jeep.frear());
        IO.println(jeep.desligar());
        IO.println();
        IO.println(fusca.ligar());
        IO.println(fusca.acelerar());
        IO.println(fusca.frear());
        IO.println(fusca.desligar());

    }
}
