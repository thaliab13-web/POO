package lab02;

/// Estação do ano. Faça um programa que leia do teclado um número inteiro que representa o
/// dia, e uma string que representa o mês. Por fim, imprima na tela a estação do ano correspondente aqui no Brasil.

public class EstacaoDoAno01 {

    static void main() {
        

        String diaS = IO.readln("Entre com o dia: ");
        int dia = Integer.parseInt(diaS); /// convertendo String para int

        //int dia = Integer.parseInt(IO.readln("Entre com o dia: "));

        String mes = IO.readln("Entre com o mes: ").toLowerCase(); /// converte para minusculo

        if ((mes.equals("marco") && dia >= 20) ///  equals verifica a igualdade
                || mes.equals("abril")
                || mes.equals("maio")
                || (mes.equals("junho") && dia < 21)) {

            IO.println("Outono");

        } else if ((mes.equals("junho") && dia >= 21)
                || mes.equals("julho")
                || mes.equals("agosto")
                || (mes.equals("setembro") && dia < 23)) {

            IO.println("Inverno");

        } else if ((mes.equals("setembro") && dia >= 23)
                || mes.equals("outubro")
                || mes.equals("novembro")
                || (mes.equals("dezembro") && dia < 21)) {

            IO.println("Primavera");

        } else if ((mes.equals("dezembro") && dia >= 21)
                || mes.equals("janeiro")
                || mes.equals("fevereiro")
                || (mes.equals("marco") && dia < 20)) {

            IO.println("Verão.");

        } else {

            IO.println("VALOR INVÁLIDO");
        }
    }
}
