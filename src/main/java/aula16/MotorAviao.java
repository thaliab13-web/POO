package aula16;

public class MotorAviao {

    private String tipoDoMotor;

    // motor inicia Desligado = false
    private boolean estadoAtual = false;

    // Construtor (Inicializando os atributos)
    public MotorAviao(String tipoDoMotor) {
        if ("turbina".equals(tipoDoMotor) || "hélice".equals(tipoDoMotor)) {
            this.tipoDoMotor = tipoDoMotor;
        } else {
            this.tipoDoMotor = "hélice";
        }
    }


    // método ligar Motor
    public boolean ligar() {
        if (!estadoAtual) {
            estadoAtual = true;
        }// senão permanece como esta
        return estadoAtual;
    }
    // método desligar Motor
    public boolean desligar() {
       // (estadoAtual == true)
        if(estadoAtual) {
            estadoAtual = false;
        }
        return estadoAtual;
    }
    // ou public boolean desligar()
    // estadoAtual = false;
    // return estadoAtual;


}

