package ads.poo.treinandoJava;

public class NumeroBinario {

    static void main() {

        String nS = IO.readln();
        int num = Integer.parseInt(nS);

        IO.println("Digite apenas digitos 0 ou 1");
        double decimal = 0;
        for (int i=0; i<num; i++) {
            String nS1 = IO.readln();
            int n = Integer.parseInt(nS1);
            if (n != 0 && n != 1) {
                IO.println("Apenas 0 ou 1");
            } else {
                decimal = decimal + n * (int) Math.pow(2, num - i);
            }

        }
        IO.println(decimal);
    }
}
