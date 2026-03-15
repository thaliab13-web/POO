package exemplosCasa;

public class Main {

    public static void main(String[] args) {

        // instaciando minha classe
        Cofrinho c1 = new Cofrinho();

        IO.println(c1.colocarMoeda(1.0));
        IO.println(c1.colocarMoeda(0.50));

       c1.quebrarCofrinho();
        IO.println(c1.colocarMoeda(0.25));

        IO.println("Valor guardado: " + c1.getValorGuardado());

        // método retorna algo? String, double, boolean, então coloca no main

    }
}
