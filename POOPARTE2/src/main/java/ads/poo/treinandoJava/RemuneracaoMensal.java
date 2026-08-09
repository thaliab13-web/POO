package ads.poo.treinandoJava;

import java.util.Scanner;

public class RemuneracaoMensal {
    public static void main(String[] args) {

//        Considere um vendedor cuja remuneração mensal é composta por um salário fixo de R$ 2000,00 mais uma comissão que depende do valor total de suas vendas. A comissão inicial é de 5% sobre o valor total de vendas, mas
//        Se o valor total de vendas alcançar a meta de R$ 10000,00, a comissão passa a ser de 7%. Além disso, quando a avaliação de desempenho do vendedor for igual ou superior a 8, ele recebe um bônus de R$ 500,00.
//    algoritmo que LÊ o valor total de vendas e a avaliação de desempenho do vendedor e ESCREVE o valor total da remuneração mensal.
//        Em seguida, efetue três testes de mesa: o primeiro com a entrada 5000 7, o segundo com a entrada 15.000 8 e o terceiro com a entrada 20.000 5.

        Scanner sc = new Scanner(System.in);

        IO.print("Total de vendas: ");
        double totalVenda = sc.nextDouble();

        IO.print("Avaliacao de desempenho: ");
        int desempenho = sc.nextInt();

        double meta = 10000.00;
        double salarioFixo = 2000.00;
        double comissao;
        double bonus = 0;

        if (totalVenda >= meta) {
            comissao = 0.07;
        } else {
            comissao = 0.05;
        }

        double totalComissao = totalVenda * comissao;

        if (desempenho >= 8) {
            bonus = 500;
            IO.println("Ganhou bonus: " + bonus);
        }

        double totalFinal = totalComissao + bonus + salarioFixo;
        IO.println("comissao: " + totalComissao);
        IO.println("Valor total da remuneração mensal: " + totalFinal);
    }
}
