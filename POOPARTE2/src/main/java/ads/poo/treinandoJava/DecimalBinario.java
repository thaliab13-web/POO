package ads.poo.treinandoJava;

import java.util.Scanner;

public class DecimalBinario {
    public static void main(String[] args) {
//       Faça um algoritmo que LÊ cinco inteiros, cada um sendo 0 ou 1, que compõem os bits da representação binária de um número e ESCREVE esse número (em decimal). Assuma que os bits são informados do mais significativo para o menos significativo. Apresente duas soluções:
//       (a) A primeira deve utilizar seis variáveis (uma para cada bit lido e outra para o resultado final em decimal).
//       (b) A segunda deve utilizar apenas duas variáveis (uma para acumular o valor do número em decimal e outra para receber cada bit lido). Para cada caso, execute um teste de mesa com a entrada 1 0 0 1 1; a saída deve ser 19


        Scanner sc = new Scanner(System.in);


        int decimal = 0;
        int bit;

        IO.print("1 Bit: ");
        bit = sc.nextInt();
        decimal = decimal * 2 + bit;

        IO.print("2 Bit: ");
        bit = sc.nextInt();
        decimal = decimal * 2 + bit;


        IO.print("3 Bit: ");
        bit = sc.nextInt();
        decimal = decimal * 2 + bit;

        IO.print("4 Bit: ");
        bit = sc.nextInt();
        decimal = decimal * 2 + bit;


        IO.print("5 Bit: ");
        bit = sc.nextInt();
        decimal = decimal * 2 + bit;

        IO.println(decimal);









//        IO.println("Somente 0 ou 1");

//        IO.print("1: ");
//        int n1 = sc.nextInt();
//        IO.print("2: ");
//        int n2 = sc.nextInt();
//        IO.print("3: ");
//        int n3 = sc.nextInt();
//        IO.print("4: ");
//        int n4 = sc.nextInt();
//        IO.print("5: ");
//        int n5 = sc.nextInt();
//
//        int decimal = n1*16 + n2*8 + n3*4 + n4*2 + n5*1;
//        IO.println(decimal);


    }
}
