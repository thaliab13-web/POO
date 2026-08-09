package ads.poo.treinandoJava;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Elabore um pseudocódigo e um fluxograma para um algoritmo que LÊ três números reais e ESCREVE o maior deles. Em seguida, efetue testes de mesa com as seguintes entradas:
//        (a) 1.0 2.5 4.0.
//        (b) 5.0 2.5 4.0
//        (c) 1.0 6.3 0.5.
//        (d) 1.0 2.6 2.6.


        IO.print("1°: ");
        double n1 = sc.nextDouble();
        IO.print("2°: ");
        double n2 = sc.nextDouble();
        IO.print("3°: ");
        double n3 = sc.nextDouble();

        if (n1 == n2 && n2 == n3) {
            IO.println(n1 + " " + n2 + " " + n3 + " são iguais");
        } else if (n1 == n2) {
            IO.println(n1 + " e " + n2 + " sao iguais");
        } else if (n1 == n3) {
            IO.println(n1 + " e " + n3 + " sao iguais");
        } else if (n2 == n3 ){
            IO.println(n2 + " e " + n3 + " sao iguais");
        } else {
            IO.println("Inválido");
        }

        if (n1 >= n2 && n1 >= n3) {
            IO.println(n1 + " é maior");
        } else if (n2 >= n1 && n2 >= n3) {
            IO.println(n2 + " e maior");
        } else {
            IO.println(n3 + " e maior");
        }
    }
}
