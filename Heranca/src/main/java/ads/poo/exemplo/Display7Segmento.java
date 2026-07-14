package ads.poo.exemplo;

public class Display7Segmento {

    private int numero;
    private Segmento segA;
    private Segmento segB;
    private Segmento segC;
    private Segmento segD;
    private Segmento segE;
    private Segmento segF;
    private Segmento segG;

    public Display7Segmento() {
        this.numero = 0;
        // instanciando o objeto-parte
        this.segA = new Segmento();
        this.segB = new Segmento();
        this.segC = new Segmento();
        this.segD = new Segmento();
        this.segE = new Segmento();
        this.segF = new Segmento();
        this.segG = new Segmento();
    }

    // metodo desligar display
    public void desligar() {
        this.numero = 0;
        this.segA.desligar();
        this.segB.desligar();
        this.segC.desligar();
        this.segD.desligar();
        this.segE.desligar();
        this.segF.desligar();
        this.segG.desligar();
    }
    // metodo exibir numero do display
    public void exibirNumero(){
        desligar(); // começa desligado
        if(this.numero == 1) {
            segB.ligar();
            segC.ligar();
        }
    }

    // alterar o valor atributo
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // retorna o numero do atributo
    public int getNumero() {
        return numero;
    }
}

