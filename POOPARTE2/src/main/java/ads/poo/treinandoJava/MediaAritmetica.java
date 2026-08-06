package ads.poo.treinandoJava;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

//     faça um algoritmo que LÊ quatro número reais representando as
//     notas de um aluno e ESCREVE a média aritmética simples destas notas. Utilize apenas duas
//   variáveis. Em seguida, execute um teste de mesa com a entrada 7.0 8.0 6.0 9.0; a saída deve ser 7.5.+++++++++++

        Scanner sc = new Scanner(System.in);

        double soma = 0;

        IO.print("nota 1: ");
        double nota = sc.nextDouble();
        soma += nota;

        IO.print("nota 2: ");
        nota = sc.nextDouble();
        soma += nota;

        IO.print("nota 3: ");
        nota = sc.nextDouble();
        soma += nota;

        IO.print("nota 4: ");
        nota = sc.nextDouble();
        soma += nota;

        double media = 0;
        media = soma/4;

        IO.println(media);

        sc.close();



    }
}
