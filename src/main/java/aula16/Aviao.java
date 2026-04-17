package aula16;

import java.util.ArrayList;

public class Aviao {

    private int tripulantes;
    private int passageiros;
    private int combustivel;
    private ArrayList<MotorAviao> motores;

    // construtor (Inicializando os atributos)
    public Aviao(int t, int p, int c){
        this.tripulantes = t;
        this.passageiros = p;
        this.combustivel = c;
        this.motores = new ArrayList<>();
    }


}
