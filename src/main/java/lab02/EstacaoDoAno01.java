package lab02;

public class EstacaoDoAno01 {

    static void main() {

        String diaS = IO.readln("Entre com o dia: ");
        int dia = Integer.parseInt(diaS);

        String mes = IO.readln("Entre com o mes: ").toLowerCase(); // converte para minusculo

        if ((mes.equals("marco") && dia >= 20)
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


            IO.println("Verão");

        } else {

            IO.println("VALOR INVÁLIDO");
        }
    }
}
