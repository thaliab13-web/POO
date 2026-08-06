package ads.poo;

public class Saudacao {
    public static void main(String[] args) {

        // Faça um programa que receba duas notas como argumentos de linha
        // de comando e imprima na tela a média e a situação do aluno
        // como aprovado (se média maior ou igual a 6) ou reprovado, caso contrário

        double nota1 = Double.parseDouble(args[0]);
        double nota2 = Double.parseDouble(args[1]);

        double media = (nota1 + nota2) / 2;
        IO.println(Math.round(media));

        if (media >= 6) {
            IO.println("Aprovado!");
        } else {
            IO.println("Reprovado!");
        }
    }
}
