package aula16;

public class MotorAviao {

    private String tipoDoMotor;
    private boolean ligado;

    // Construtor (Inicializando os atributos)
    public MotorAviao(String tipoDoMotor, boolean ligado) {
        tipoDoMotor = tipoDoMotor.toLowerCase(); // converte pra minusculo
        if("turbina".equals(tipoDoMotor) || "helice".equals(tipoDoMotor)) {
           this.tipoDoMotor = tipoDoMotor;
       } else {
           this.tipoDoMotor = "helice";
       }
       this.ligado = false;
    }

    public void ligar() {
        ligado = true;
    }
    public void desligar() {
        ligado = false;
    }
    public boolean isLigado() {
        return ligado;
    }
    @Override
    public String toString() {
        return String.format(
                """     
                        Tipo: 
                        %s
                        Ligado:
                        %s
                        """,
                tipoDoMotor,
                ligado
        );
    }

}

