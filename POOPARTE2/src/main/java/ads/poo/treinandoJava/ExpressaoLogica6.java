package ads.poo.treinandoJava;

import java.util.Scanner;

public class ExpressaoLogica6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Suponha que, em determinado país, um cidadão pode se aposentar se satisfizer pelo menos uma das seguintes condições:
//        • Ter pelo menos 65 anos.
//        • Ter trabalhado pelo menos 30 anos.
//        • Ter pelo menos 60 anos e trabalhado pelo menos 25 anos.
//        Escreva uma expressão lógica que, dadas as variáveis inteiras 𝑖𝑑𝑎𝑑𝑒 e 𝑡𝑒𝑚𝑝𝑜, representando a idade e o tempo de serviço, assume o valor T, se o cidadão pode se aposentar, ou F, caso contrário.


        IO.print("Idade: ");
        int idade = sc.nextInt();
        IO.print("Tempo de Servico: ");
        int tempoServico = sc.nextInt();

        if ((idade >= 65 || tempoServico >= 30) || (idade >= 60 && tempoServico >= 25)) {
            IO.println("Aposenta");
        } else {
            IO.println("Não pode aposentar");
        }


    }
}
