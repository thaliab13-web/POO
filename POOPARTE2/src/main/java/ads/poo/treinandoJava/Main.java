package ads.poo.treinandoJava;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        double p1,p2,p3,aux;
//
//        p1 = sc.nextDouble();
//        aux = sc.nextDouble();
//        p1 = p1*aux;
//
//        p2 = sc.nextDouble();
//        aux = sc.nextDouble();
//        p2 = p2*aux;
//
//        p3 = sc.nextDouble();
//        aux = sc.nextDouble();
//        p3 = p3*aux;
//
//        aux = p1+p2+p3;
//
//        System.out.printf("%.2f %.2f %.2f %.2f%n ", p1, p2,p3,aux);
//
//
//
//        String num = IO.readln("Numero: ");
//        int n = Integer.parseInt(num);
//
//        IO.println("Números pares menores ou igual a " + n);
//        for (int i = n; i >= 0; i--) {
//            if (i % 2 == 0) {
//                IO.println(i);
//            }
//        }
//
//        IO.println("Soma dos impares menores ou igual a " + n);
//
//        int somaImpares = 0;
//        for (int i = 0; i <= n; i++) {
//            if (i % 2 != 0) {
//                somaImpares+=i;
//            }
//        }
//        IO.println(somaImpares);
//
//        //    sc.close();

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
       IO.println(media);
    }

}