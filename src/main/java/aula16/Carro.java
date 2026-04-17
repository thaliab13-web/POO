package aula16;

public class Carro {

    private String marca;

    // guarda um objeto
    private MotorCarro propulsor;

    // Construtor (Inicializando os atributos) - Agregação
    public Carro(String marca, MotorCarro motorCarro) {
        this.marca = marca;
        this.propulsor = motorCarro;
    }

    // Delegação, o carro não faz o trabalho, ele passa para o motor
    public void acelerar(int v) {
        IO.println("Carro " + marca + " acelerando em " + v);
        // Motor acelera ai com esse valor X
        propulsor.acelerar(v);
    }
    // Agregação, esse metodo recebe um objeto do tipo Motor
    public void trocarMotor(MotorCarro motorCarro) {
        // agora o motor do carro passa ser esse aqui
        this.propulsor = motorCarro;
        IO.println("Motor trocado!");
    }
}
