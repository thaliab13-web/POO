package treinandoEmCasa;

public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;


    public void setTitular(String t) {
        this.titular = t;
    }
    public String getTitular() {
        return titular;
    }

    public void setNumeroConta(int n) {
        this.numeroConta = n;
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }
    public double getSaldo(){
        return saldo;
    }

    /* Método de ação */

    public double depositar(double valor) {
       saldo += valor;
       return saldo;
    }

    public double sacar(double valor) {
        saldo -=valor;
        return saldo;

    }

    public void mostrarDados() {
        IO.println("Titular: " + titular);
        IO.println("Número da conta: " + numeroConta);
        IO.println("Saldo Atual: " + saldo);

    }
}
