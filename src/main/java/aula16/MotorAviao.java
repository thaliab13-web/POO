package aula16;

public class MotorAviao {

   private String tipoDoMotor;
   private boolean estadoAtual = false;

   // Construtor (Inicializando os atributos
   public MotorAviao(String tipoDoMotor) {
       this.tipoDoMotor = tipoDoMotor;
       if("turbina".equals(tipoDoMotor) || "hélice".equals(tipoDoMotor)) {
           this.tipoDoMotor = tipoDoMotor;
       } else {
           this.tipoDoMotor = "hélice";
       }
   }

   public boolean ligar() {
    if(!estadoAtual) {
        return true;
        IO.println("Motor ligado");
    } else {
        return false;
        IO.println("D");
    }
   }


}
