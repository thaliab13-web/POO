package aula16;

public class Carro {

    private String marca;

    // guarda um objeto
    private Motor propulsor;

    // Construtor (Inicializando os atributos) - Agregação
    public Carro(String marca, Motor motor) {
        this.marca = marca;
        this.propulsor = motor;
    }

    // Delegação, o carro não faz o trabalho, ele passa para o motor
    public void acelerar(int v) {
        IO.println("Carro " + marca + " acelerando em " + v);
        // Motor acelera ai com esse valor X
        propulsor.acelerar(v);
    }
    // Agregação, esse metodo recebe um objeto do tipo Motor
    public void trocarMotor(Motor motor) {
        // agora o motor do carro passa ser esse aqui
        this.propulsor = motor;
        IO.println("Motor trocado!");
    }
}
