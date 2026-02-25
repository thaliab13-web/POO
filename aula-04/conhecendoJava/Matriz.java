public class Matriz {

    public static void main(String[] args) {
            

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matriz 3x3");
        System.out.println();
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
        
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("====================");
        System.out.println("Diagonal Principal");

        for(int j = 0; j < 3; j++) {
            // Acessa matriz[0][0], matriz[1][1], matriz[2][2]

            System.out.println(matriz[j][j] + " ");
        }   
        System.out.println("====================");


        
        System.out.println("Usando for-each"); 
        for(int[] linha : matriz) {
            for(int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    
    }
}

