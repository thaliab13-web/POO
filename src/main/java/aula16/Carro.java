package aula16;

public class Carro {

    private String marca;
    private Motor propulsor;

    public Carro(String marca, Motor propulsor) {
        this.marca = marca;
        this.propulsor = propulsor;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
