package aula16;

import java.util.ArrayList;

public class Aviao {

    private int tripulantes;
    private int passageiros;
    private int combustivel;
    private ArrayList<MotorAviao> qtdMotores;

    // construtor (Inicializando os atributos)
    public Aviao(int tripulantes, int passageiros, int combustivel, String tipoDoMotor,int qtdMotores){
        this.tripulantes = tripulantes;
        this.passageiros = passageiros;
        this.combustivel = combustivel;
        this.qtdMotores = new ArrayList<>();
        if(qtdMotores < 1 || qtdMotores > 8) {

        }
    }


}
