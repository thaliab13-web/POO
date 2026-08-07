package ads.poo.treinandoJava;

public class NumeroDivisivel2ou3 {
    public static void main(String[] args) {
//        Um inteiro positivo é considerado especial se for divisível por 2 ou por 3, mas não por ambos.
//        No entanto, se o número for múltiplo de 10, ele não é considerado especial, independentemente de satisfazer a condição anterior.
//        Por exemplo: • O número 64 é especial, pois é divisível por 2 e não por 3.
//        • O número 33 é especial, pois é divisível por 3 e não por 2.
//        • O número 42 não é especial, pois é divisível simultaneamente por 2 e por 3.
//        • O número 80 seria especial (divisível por 2 e não por 3), mas não é, pois é múltiplo de10.
//        Escreva uma expressão lógica que, dado um inteiro positivo 𝑛, assume o valor T, se 𝑛 é especial, ou F, caso contrário.
//        Dica: Lembre-se que 𝑎 é divisível por 𝑏 se e somente se o resto da divisão de 𝑎 por 𝑏 é igual a zero.

        String n = IO.readln("Numero: ");
        int num = Integer.parseInt(n);

        if ((num % 2 == 0 || num % 3 == 0) && (num % 6 != 0) && (num % 10 != 0)) {
            IO.println("especial");
        } else {

            IO.println(num + " nao Especial");
        }
    }
}
