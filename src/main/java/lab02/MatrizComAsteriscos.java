package lab02;

public class MatrizComAsteriscos {
    static void main(String[] args) {

        int tamanho = 9;
        char[][] matriz = new char[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = '*';
            }
        }
    }
}
