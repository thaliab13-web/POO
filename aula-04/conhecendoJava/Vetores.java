public class Vetores {

    public static void main(String[] args) {
        
        // Vetor de inteiros com 5 posições

        int[] numeros = new int[5];
        numeros[0] = 10; // primeira posição é 0
        numeros[4] = 20; // última posição é 4

        //inicialização direta
        int[] pares = {2, 4, 6, 8}; // ou int[] impares = new int[]{1, 3, 5, 7};
        
        // Percorrer todos os elementos de um vetor

        int[] numero = {10, 20 ,30};

        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);   
        }

        System.out.println("=======================");
        // for-each
        for(int valor : numero) {
            System.out.println(valor);
        }
    }
}