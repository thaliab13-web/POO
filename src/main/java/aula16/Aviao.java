package aula16;

import java.util.ArrayList;

public class Aviao {

    private int tripulantes;
    private int passageiros;
    private int combustivel;
    private ArrayList<MotorAviao> motores;

    // construtor (Inicializando os atributos)
    public Aviao(int tripulantes, int passageiros, int combustivel, String tipoDoMotor,int motores){
        this.tripulantes = tripulantes;
        this.passageiros = passageiros;
        this.combustivel = combustivel;
        this.motores = new ArrayList<>();

        // se for menor que 1 e maior que 8, então recebe 8 motores
        if(motores < 1 || motores > 8) {
            motores = 8;
        }
        // criando os motores e colocando dentro do avião
        // crie x motores e coloque dentro do avião
        for (int i = 0; i < motores; i++) {

            // criando um novo motor e passando o tipo do motor (helice ou turbina)
            this.motores.add(new MotorAviao(tipoDoMotor));
        }
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public ArrayList<MotorAviao> getMotores() {
        return motores;
    }

    public void setMotores(ArrayList<MotorAviao> motores) {
        this.motores = motores;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(int tripulantes) {
        this.tripulantes = tripulantes;
    }

    // método ligar Aviao e Motor
    public void ligar() {
        // percorre a lista motores
        // pega um motor por vez (m)
        // e chama a função ligar()
        // para cada motor dentro da lista
        for(MotorAviao m : motores) {
            m.ligar();
        }
    }

    // método desligar Aviao e Motor
    public void desligar() {
        // para cada Motor dentro de motores
        for(MotorAviao m : motores) {
            m.desligar();
        }
    }

    // método ligar motor individualmente
    public void ligarMotor(int posicao) {
        int indice = posicao - 1; // converte 1 -> 0
            if(posicao >= 0 && posicao <= 8) {
               motores.get(posicao).ligar();
           } else {
                IO.println("ERRO, NÚMERO DE MOTOR INVÁLIDO");
            }
    }

    // método desligar motor individualmente
    public void desligarMotor(int posicao) {
        int indice = posicao - 1; // converte 1 -> 0
        if (posicao >= 0 && posicao <= 8) {
                motores.get(posicao).desligar();
            } else {
                IO.println("ERRO, NÚMERO DE MOTOR INVÁLIDO");
            }

    }

    // método ver estado do motor (ligado ou desligado)
    public void verStatus() {
        for (int i = 0; i < motores.size(); i++) {
            IO.println("Motor n° " + (i + 1) + " - status: " + motores.get(i).getEstadoAtual());
        }
    }


}
