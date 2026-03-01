package lab02;

import java.util.Random;

///
public class AcerteNumero {
    static void main() {

        // contador
        int tentativasRealizadas = 0;
        int palpite = 0;
        // gera de número aleatorios
        Random gerador = new Random();
        // Gerar número entre 1 e 100 (nextInt(100) gera 0-99, então soma + 1
        int numAleatorio = gerador.nextInt(100) + 1;

        IO.println();
        IO.println("************************************************************");
        IO.println("*               Adivinhe o número entre 1 e 100          *");
        IO.println("************************************************************");

        //  Enquanto o palpite for diferente do número Aleatório ele roda, quando for igual ele sai fora
        while(palpite != numAleatorio) {

            palpite = Integer.parseInt(IO.readln("Qual é o seu Palpite? "));
            tentativasRealizadas++; // incrementando o contador com a qtd de vezes que vai rodar o programa

        if(palpite == numAleatorio) {
            IO.println("Parabéns você acertou");
            IO.println("Precisou de " + tentativasRealizadas + " tentativa(s)");
            IO.println("************************************************************");
        } else if (palpite > numAleatorio) {
            IO.println("Tá frio, seu palpite ta muito alto, diminui...");
            IO.println("Tente novamente!");
            IO.println("************************************************************");
        } else {
            IO.println("Tá frio, seu palpite ta muito baixo, aumenta...");
            IO.println("Tente novamente!");
            IO.println("************************************************************");
        }
        }
    }
}
