package ads.poo;

import java.util.Scanner;


public class Arquivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        leitor.hasNext();

        while(leitor.hasNext()) {

            String linha = leitor.nextLine();
            String[] campos = linha.split(",");

            String nome = campos[0];

            double n1 = Double.parseDouble(campos[1]);
            double n2 = Double.parseDouble(campos[2]);

            double media = (n1+n2)/2;


            IO.println(nome + " - Média: " + Math.round(media));
        }

        leitor.close();
    }
}
