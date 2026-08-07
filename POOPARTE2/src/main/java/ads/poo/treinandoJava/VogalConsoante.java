package ads.poo.treinandoJava;

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Escreva uma expressão lógica que, dado um caractere chamado 𝑙𝑒𝑡𝑟𝑎, representando uma letra minúscula do alfabeto latino, assume o valor T, se 𝑙𝑒𝑡𝑟𝑎 é uma vogal, ou F, se 𝑙𝑒𝑡𝑟𝑎 é uma consoante

        IO.print("Letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            IO.println("Vogal");
        } else {
            IO.println("Consoante");
        }
    }
}
