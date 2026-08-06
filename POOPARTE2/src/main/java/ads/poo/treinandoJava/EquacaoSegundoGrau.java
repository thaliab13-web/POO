package ads.poo.treinandoJava;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
//      Faça um algoritmo que LÊ três números reais 𝑎, 𝑏 e 𝑐, representando os coeficientes de uma equação de segundo grau, e ESCREVE o valor do discriminante Δ = 𝑏 2 − 4𝑎𝑐 da equação. Assuma que não há operador de exponenciação disponível. Em seguida, execute um teste de mesa com a entrada 1 5 -3; a saída deve ser 37.

        String aa = IO.readln("a: ");
        double a = Double.parseDouble(aa);
        String bb = IO.readln("b: ");
        double b = Double.parseDouble(bb);
        String cc = IO.readln("c: ");
        double c = Double.parseDouble(cc);

        double discriminante = (b * b) - 4*a*c;

        IO.println(discriminante);
    }
}
