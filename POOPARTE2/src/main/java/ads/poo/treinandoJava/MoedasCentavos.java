package ads.poo.treinandoJava;

import java.util.Scanner;

public class MoedasCentavos {
    public static void main(String[] args) {
//  Faça um algoritmo que LÊ um número inteiro representando um valor em centavos e ESCREVE a moedas necessárias para formar esse valor, dando preferência para as moedas de maior valor. As moedas disponíveis são de 50, 25, 10, 5 e 1 centavo. Por exemplo, para formar 68 centavos é necessário 1 moeda de 50 centavos, 0 moedas de 25 centavos, 1 moeda de 10 centavos, 1 moeda de 5 centavos e 3 moedas de 1 centavo. Em seguida, execute um teste de mesa com a entrada 57; a saída deve ser 1 0 0 1 2.

        Scanner sc = new Scanner(System.in);

        IO.print("Valor em centavos: ");
        int centavos = sc.nextInt();

        int moeda50 = centavos / 50;
        centavos = centavos % 50;

        int moeda25 = centavos / 25;
        centavos = centavos % 25;

        int moeda10 = centavos / 10;
        centavos = centavos % 10;

        int moeda5 = centavos / 5;
        centavos = centavos % 5;

        int moeda1 = centavos / 1;
        centavos = centavos % 1;

        IO.println("Moeda de 50: " + moeda50);
        IO.println("Moeda de 25: " + moeda25);
        IO.println("Moeda de 10: " + moeda10);
        IO.println("Moeda de 5: " + moeda5);
        IO.println("Moeda de 1: " + moeda1);

    }
}
