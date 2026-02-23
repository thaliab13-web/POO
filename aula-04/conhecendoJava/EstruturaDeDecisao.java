public class EstruturaDeDecisao {

    public static void main(String[] args) {
        // Estrutura if−else

        int i = 1;
        if (i > 10) {
            System.out.println("É maior");
        } else if (i < 10) {
            System.out.println("É menor");
        } else {
            System.out.println("São iguais");
        }

        // Operador lógico AND (E)

        char c = 'a';
        if (i != 10 && c == 'a') {
            System.out.println("Operador AND");
        }

        // Operador ternário

        // resultado = (condição) ? se verdade : falso
        
        int hora = 15;
        String s = (hora > 12) ? "tarde" : "noite";
        System.out.println(s);


        // Tradicional switch case

        switch (i) {
            case 1:
                System.out.println("Um");
            break;
            default:
                System.out.println("Outro");
        }

        // Com expressões lambda (Java 14 ou superior)
        switch (i) {
            case 1 -> System.out.println("um");
            default -> System.out.println("outro");
        }

        // Switch com expressão
        String m = switch(i) {
            case 1 -> "uM";
            default -> "oUtro";
        };
        System.out.println(m);

        // ou 

        String n;
        int b = 1;

        switch (b) {
            case 1: 
                n = "un";
                System.out.println(n);
                break;
            default:
                n = "OUtro";
                System.out.println(n);
                break;            
        }
    }
}