package aula10;

public class Personagem {

    // atributos
    private String corRoupa;
    private String nomePersonagem;
    private int vida;
    private int qtdForca;
    private int soco;

    // Métodos

    // método de ação
    public void soco() {
        if(soco < 5) {
            soco++; // acumulador
            int socoRestante = 5 - soco; // pra ver quanto de soco ainda resta
            IO.println(nomePersonagem + " deu soco");
            IO.println("Restam " + socoRestante + " socos.");
        } else {
            IO.println(nomePersonagem + " está cansado não pode dar soco");
        }
    }
    public void setCorRoupa(String r) {

        corRoupa = r;
    }

    public void setNomePersonagem(String n) {

        nomePersonagem = n;
    }

    public void setVida(int v) {
        vida = v;
    }

   public void setQtdForca(int f) {
        qtdForca = f;
   }

    public int getQtdForca() {
        return qtdForca;
    }

    public int getVida() {
        return vida;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }
    public String getCorRoupa() {
        return corRoupa;
    }

    public void atacar() {
        IO.println(nomePersonagem + " atacou");
    }


}
