package aula05;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta; // false

    public String desenhar(int x1, int y1, int x2, int y2) {

        if(aberta) {
            double distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

            if(nivelTinta < distancia*0.01) {
                return "Sem Tinta";
            } else {
               // nivelTinta = nivelTinta - distancia * 0.01;
                nivelTinta -= distancia *0.01;
            }

            return String.format("Desenhei %.2f cm na cor %s ", distancia, cor);
        }
        return "caneta está fechada";

    }
    public double getNivelTinta() {
        return nivelTinta;
    }

    public String getCor() {
        return cor;
    }


    public void setCor(String c) {
        cor = c;
    }
    public void setNivelTinta(double d) {
        nivelTinta = d;
    }

    public void abrirTampa() {
        aberta = true;
    }
    public void fecharTampa() {
        aberta = false;
    }


}