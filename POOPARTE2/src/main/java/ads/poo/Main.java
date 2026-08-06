package ads.poo;

// Faça um programa que o usuário deve informar a sigla da disciplina, todos os dias da semana que tem aula dessa disciplina.
//Imprima - Na disciplina POO vc tem aulas nos seguintes dias:
// - seg
// - ter
public class Main {
    static void main(String[] args) {

    String sigla = IO.readln("Informe a disciplina: ");

    String[] dias = new String[5];
    int qtdDias = 0;

    while(true) {
        String diaAula = IO.readln("Informe os dias da semana (ou nao para encerrar): ");

        if (diaAula.equalsIgnoreCase("seg") || diaAula.equalsIgnoreCase("ter") || diaAula.equalsIgnoreCase("qua") || diaAula.equalsIgnoreCase("qui") || diaAula.equalsIgnoreCase("sex")) {
            dias[qtdDias] = diaAula;
            qtdDias++;

        } else if (diaAula.equalsIgnoreCase("nao")) {
            break;
        } else {
            IO.println("Tente novamente");
        }

    }
        IO.println("A disciplina " + sigla + " sao nos dias da semana: " );
    for (int i = 0; i < qtdDias; i++) {
        IO.println(dias[i]);
    }

        IO.println("Encerrando o programa...");
    }
}