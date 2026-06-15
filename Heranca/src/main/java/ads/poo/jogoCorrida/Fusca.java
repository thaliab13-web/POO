package ads.poo.jogoCorrida;

public class Fusca extends CarroBase implements Carro {

    public Fusca(String cor, String modelo) {
        super(cor, "Fusca", modelo);
    }

    @Override
    public String acelerar(){
        return "Acelerando Fusca";
    }
    @Override
    public String frear(){
        return "Freando Fusca";
    }

    @Override
    public String ligar(){
        return "Ligando Fusca";
    }

    @Override
    public String desligar(){
        return "Desligando Fusca";
    }


}
