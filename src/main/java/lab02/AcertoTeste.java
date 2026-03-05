package lab02;

import java.util.Random;

public class AcertoTeste {
    static void main() {

        int palpite = 0;
        int tentativasRealizadas = 0;

        Random gerador = new Random();

        int aleatorio = gerador.nextInt(1, 100); // aleatorio vai do 0 a 99 por isso +1

        IO.println("Tenta acerta ");

        do {
            palpite = Integer.parseInt(IO.readln("Palpite:"));
            tentativasRealizadas++;

            if (palpite == aleatorio) {
                IO.println("Acertou");
                IO.println("Tentativas: " + tentativasRealizadas);
            } else if (palpite < aleatorio) {
                IO.println("Tente um numero maior");
            } else {
                IO.println("Tente um numero menor");
            }
        }while(palpite != aleatorio);

    }
}
