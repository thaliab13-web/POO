package ads.poo.treinandoJava;

import java.util.Scanner;

public class MediaDeIntervalos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = IO.readln("Numero: ");
        int num = Integer.parseInt(n);

        double soma = 0;
        int acumu=0;
        for (int i = 0; i < num; i++) {
            String n1 = IO.readln("Numero: ");
            double num1 = Double.parseDouble(n1);
            if (num1 >= 5 && num1 <= 10) {
                soma+=num1;
                acumu++;

            }
        }
        double media = soma/acumu;
        IO.println(Math.round(media));

        sc.close();
    }

//    public static void print() {
//        for (int i=1; i<=5; i++) {
//            IO.println("i = " + i);
//        }
//    }

}
