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

    // metodo ligar Motor
    public boolean ligar() {
        if (!estadoAtual) {
            estadoAtual = true;
        }// senão permanece como esta
        return estadoAtual;
    }
    // metodo desligar Motor
    public boolean desligar() {
        if(estadoAtual) {
            estadoAtual = false;
        }
        return estadoAtual;
    }

}

