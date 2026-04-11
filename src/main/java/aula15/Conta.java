package aula15;

public class Conta {
    private String titular;
    private double saldo;
    private  String numeroConta;

    public Conta(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = (saldo > 0) ? saldo : 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            IO.println("Valor inválido!");
        } else {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            IO.println("Valor inválido!");
        } else if (valor > saldo) {
            IO.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    public String toString(){
        return String.format("""
                Conta: %s
                Titular: %s
                Saldo: %.2f
                """, numeroConta, titular, saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // me devolve o número dessa conta
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumero(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
