package ads.poo.jogoCorrida;

public class Jeep extends CarroBase implements Carro {

    public Jeep(String cor, String modelo) {
        super(cor, "Jeep", modelo);
    }
    @Override
    public String acelerar() {
        return "Jeep acelerando...";
    }

    @Override
    public String frear() {
        return "Freando Jeep.";
    }

    @Override
    public String ligar() {
        return "Ligando Jeep...";
    }

    @Override
    public String desligar() {
        return "Desligando Jeep...";
    }
}
