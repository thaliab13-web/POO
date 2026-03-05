package aula05;

public class MainAula1POO {
    static void main(String[] args) {

     // Instaciando a classe
    Lampada lampada1  = new Lampada();
    Lampada lampada2 = new Lampada();

    lampada1.ligarDesligar();

    IO.println(lampada1.isLigada());
    IO.println(lampada2.isLigada());



    }
}