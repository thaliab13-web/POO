package aula16;


import java.util.ArrayList;

public class Aviao {
    private int tripulantes;
    private int passageiros;
    private double combustivel;
    private ArrayList<MotorAviao> motores;

    public Aviao(int tripulantes, int passageiros, double combustivel) {
        this.tripulantes = tripulantes;
        this.passageiros = passageiros;
        this.combustivel = combustivel;
        this.motores = new ArrayList<>();
    }
    public void adicionarMotor(MotorAviao motor) {
        if(motores.size() < 8) {
            motores.add(motor);
        } else {
            IO.println("Limite de motores atingido!");
        }
    }

    public void ligarAviao() {
        for (MotorAviao m : motores) {
            m.ligar();
        }
    }
    public void desligarAviao() {
        for (MotorAviao m : motores) {
            m.desligar();
        }
    }
    public void ligarMotor(int index) {
        if(index >= 0 && index < motores.size()) {
            motores.get(index).ligar();
        }
    }
    public void desligarMotor(int index) {
        if(index >= 0 && index < motores.size()) {
            motores.get(index).desligar();
        }
    }
    @Override
    public String toString() {
        return String.format(
                """
                        Tripulantes: %d
                        Passageiros: %d
                        Combustivel: %.2f
                        Motores: %s
                        """,
                tripulantes,
                passageiros,
                combustivel,
                motores
        );
    }



}
