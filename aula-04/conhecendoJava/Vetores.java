public class Vetores {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        numeros[0] = 10; // primeira posição é 0
        numeros[4] = 20; // última posição é 4

        int[] impares = new int[10];
        impares[0] = 3;

        for (int i = 1; i < impares.length; i++) {
            impares[i] = impares[i - 1] + 2;
            System.out.println(impares[i]);
        }

        System.out.println("=======================");
        System.out.println("Usando for-each");
        for (int valor : numeros) {
            System.out.print(valor + "\t");
        }

    }
}