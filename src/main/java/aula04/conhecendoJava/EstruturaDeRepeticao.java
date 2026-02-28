public class EstruturaDeRepeticao {

    public static void main(String[] args) {
        
        // for tradicional

        for(int i = 0; i<10; i++) {
            System.out.println("i: " + i);
        }
        System.out.println("================================");
        // While

        int i = 0;

        while(i < 10) {
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("================================");

        // do-while

        int j = 10;
        
        do { 
            System.out.println("j: " + j);
            j--;
        } while (j > 0);
    }
}