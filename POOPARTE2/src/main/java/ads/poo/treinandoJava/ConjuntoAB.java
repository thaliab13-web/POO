package ads.poo.treinandoJava;

public class ConjuntoAB {
    public static void main(String[] args) {
//        Considere os conjuntos 𝒜 = {𝑥 ∈ ℤ | 𝑛1 ≤ 𝑥 ≤ 𝑛2} e ℬ = {𝑥 ∈ ℤ | 𝑛3 ≤ 𝑥 ≤ 𝑛4}, em que 𝑛1,𝑛2,𝑛3,𝑛4 são inteiros.
//        Elabore um pseudocódigo para um algoritmo que LÊ os valores de 𝑛1,𝑛2,𝑛3,𝑛4, bem como de um inteiro 𝑥 e ESCREVE se 𝑥 pertence somente ao conjunto 𝒜, somente ao conjunto ℬ, a ambos os conjuntos, ou a nenhum deles.

        String a = IO.readln("N1: ");
        int n1 = Integer.parseInt(a);
        String b = IO.readln("N2: ");
        int n2 = Integer.parseInt(b);
        String c = IO.readln("N3: ");
        int n3 = Integer.parseInt(c);
        String d = IO.readln("N4: ");
        int n4 = Integer.parseInt(d);
        String n = IO.readln("x: ");
        int x = Integer.parseInt(n);

        // a = {𝑥 ∈ ℤ | 𝑛1 ≤ 𝑥 ≤ 𝑛2} e ℬ = {𝑥 ∈ ℤ | 𝑛3 ≤ 𝑥 ≤ 𝑛4}
        // x deve ser maior ou igual a n1
        // x deve ser menor ou igual a n2

        // verificando se x pertence a ambos

        if ((x < n1 && x < n2) || (x > n1 && x > n2) &&
            (x < n3 && x < n4) || (x > n3 && x > n4)) {
            IO.println("X não pertence ao conjunto A em B");
        } else if ((x >= n1 && x <= n2) || (x >= n2 && x <= n1) && ((x >= n3 && x <= n4) || (x >= n4 && x <= n3))) {
            IO.println("X pertence a ambos conjuntos");
        } else if ((x >= n1 && x <= n2) || x >= n2 && x <= n1) {
            IO.println("X pertence ao conjunto A");
        } else {
            IO.println("X pertence ao conjunto B");
        }

    }
}
