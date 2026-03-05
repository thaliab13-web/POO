package lab02;

public class AsciiArt {
    static void main(String[] args) {

        // Para ler o tamanho do args
        for(int i = 0; i < args.length; i++) {
            IO.println(i + " -> " + args[i]);
        }

        // se args for menor que dois não tenho parametros o suficientes, preciso de Figura e tamanho
        if (args.length < 2) {
            IO.println("Use: Triangulo n | Losango n | Retangulo altura largura");

            // Primeiro args é o tipo da figura
        } else if (args[0].equals("Triangulo")) {

            // Convertendo args em inteiro
            int tamanho = Integer.parseInt(args[1]);

            // for para roda as linhas
            for (int i = 1; i <= tamanho; i++) {
                //for interno para os asteriscos
                for (int j = 1; j <= i; j++) {
                    IO.print("*");
                }
                IO.println();
            }

        } else if (args[0].equals("Losango")) {
           // convertendo meu args em inteiro
            int tamanho = Integer.parseInt(args[1]);

            // Parte de Cima é Crescente
            for (int k = 1; k <= tamanho; k++) {
                // Para acrecentar os Espaços
                for (int l = 1; l <= tamanho - k; l++) {
                    // tamanho - 1, conforme l cresce os espaços diminuem (5-1=4  " ")
                    IO.print(" ");
                }
                // Para acrecentar Asteriscos
                for (int m = 1; m <= 2 * k - 1; m++) {
                    // 2*k-1 gera sequencia impar, O número de * sempre cresce de 2 em 2.
                    IO.print("*");
                }
                IO.println();
            }
            // Parte de Baixo Decrescente
            for(int i = tamanho - 1; i >=1; i--) {

                // Para Acrescentar espaços
                for(int j = 1; j <= tamanho - i; j++) {
                    IO.print(" ");
                }
                // Para Acrescentar asteriscos
                for (int k = 1; k <= 2*i-1; k++) {
                    IO.print("*");
                }
                IO.println();
            }

        } else {
            String tipo = args[0];
            int altura = Integer.parseInt(args[1]);
            int largura = Integer.parseInt(args[2]);
            // Para cada linha

            if (tipo.equals("Retangulo")) {

                for (int i = 1; i <= altura; i++) {

                    // Para cada coluna
                    for (int j = 1; j <= largura; j++) {

                        if (i == 1 || i == altura || j == 1 || j == largura) {
                            IO.print("*");
                        } else {
                            IO.print(" ");
                        }
                    }
                    IO.println();
                }

            }

        }
    }
}

