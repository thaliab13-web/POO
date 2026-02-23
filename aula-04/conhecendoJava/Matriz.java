public class Matriz {

    public static void main(String[] args) {
        
        // Percorrer todos os elementos de uma matriz usando dois laços for ou for-each aninhados
        
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };
        // for tradicional

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
        System.out.println("========================");

        // Usando for-each

        for(int[] linha : matriz) {
            for(int valor : linha) {
                System.out.println(valor);
            }
        }
    }
}