package lab02;

public class AsciiArt {
    static void main(String[] args) {

        int tamanho;
        int altura;
        int largura;
        String figura = IO.readln("Digite a figura: ").toLowerCase();

        if (figura.equals("triangulo")) {
            tamanho = Integer.parseInt(IO.readln("Qual tamanho? "));

            IO.println(figura + "  " + tamanho);
            // for para linhas
            for (int i = 0; i <= tamanho; i++) {
                //for interno para os ****
                for (int j = 0; j <= i; j++) {

                    IO.print("*");
                }
                IO.println();
            }
        }
        else if (figura.equals("losango")) {
            tamanho = Integer.parseInt(IO.readln("Qual tamanho? "));

            IO.println(figura + "  " + tamanho);
            // for crescente
            for(int i = 1; i <= tamanho; i++) {
                // espaços
                for(int k = 1; k <= tamanho - i; k++) {
                    //tamanho - 1; conforme i cresce, os espaços diminuem
                    IO.print(" ");
                }
                // estrelas **
                for(int y = 1; y <= 2*i-1; y++) {
                    // (2 * i - 1) gera sequencia Impar
                    IO.print("*");
                }
                IO.println();
            }
            // for decrescente
            for(int j = tamanho - 1; j >= 1; j--) {
                for(int k = 1; k <= tamanho - j; k++) {
                    IO.print(" ");
                }
                // estrelas **
                for(int y = 1; y <= 2*j-1; y++) {
                    IO.print("*");
                }
                IO.println();
            }
        } else if (figura.equals("retangulo")) {
            altura = Integer.parseInt(IO.readln("Qual altura? "));
            largura = Integer.parseInt(IO.readln("Qual largura? "));

            for(int i = 1; i <= altura; i++) {
                for (int j = 1; j <= largura; j++) {

                    if(i == 1 || i == altura || j == 1 || j == largura) {
                        // i == 1 -> primeira linha
                        // i == altura -> ultima linha
                        // j == 1 -> primeira coluna
                        // j == largura -> ultima coluna
                        IO.print("*");
                    } else {
                        IO.print(" ");
                    }
                }
                IO.println();
            }
        } else {
            IO.println("Valor inválido");
        }


    }
}

