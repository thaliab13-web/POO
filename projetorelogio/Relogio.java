public abstract class Relogio{
    protected byte hora;
    protected byte minuto;
    protected byte segundo;

    public Relogio(byte hora, byte minuto, byte segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public void setHora(byte hora) {
        this.hora = hora;
    }
    public void setMinuto(byte minuto) {
        this.minuto = minuto;
    }
    public void setSegundo(byte segundo) {
        this.segundo = segundo;
    }
    public byte getHora() {
        return hora;
    }
    public byte getMinuto() {
        return minuto;
    }
    public byte getSegundo() {
        return segundo;
    }
    // método igual pra todos
    public void avancarOtempo() {

    }

    // cada filho desenha diferente 
    public abstract void desenharNaTela();
    
    
}
