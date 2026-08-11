package ads.poo.treinandoJava;

public class Triangulo {
    public static void main(String[] args) {

// Dados os valores de três lados, 𝑎, 𝑏 e 𝑐, sabemos que eles podem formar um triângulo se e somente se a soma de quaisquer dois lados é sempre maior que o terceiro lado.

// Por exemplo: • Os números (3,4,5) formam um triângulo, pois: 3+4>5, 3+5>4, 4+5>3. •

//Os números (2,3,6) não formam um triângulo, pois: 2 +3>6, ainda que 3+6>2 e 2+6>3.

//Além disso, se os três lados de um triângulo são iguais, então ele é chamado de triângulo equilátero.

// Se dois lados são iguais e o terceiro é diferente, então ele é chamado de triângulo isósceles. Se todos os lados são diferentes, então ele é chamado de triângulo escaleno.

// Elabore um fluxograma e um pseudocódigo para um algoritmo que LÊ três números reais representando os lados de um triângulo e ESCREVE a classificação deste triângulo (Equilátero, Isósceles ou Escaleno) ou a mensagem Não forma um triângulo.

        String a1 = IO.readln("a: ");
        double a = Double.parseDouble(a1);
        String b2 = IO.readln("b: ");
        double b = Double.parseDouble(b2);
        String c3 = IO.readln("c: ");
        double c = Double.parseDouble(c3);

        // Por exemplo: • Os números (3,4,5) formam um triângulo, pois: 3 +4>5, 3+5>4, 4+5>3.
        //Além disso, se os três lados de um triângulo são iguais, então ele é chamado de triângulo equilátero.
        // Se dois lados são iguais e o terceiro é diferente, então ele é chamado de triângulo isósceles. Se todos os lados são diferentes, então ele é chamado de triângulo escaleno.


        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            IO.println("é triângulo");

            if (a == b && b == c) {
                IO.println("triângulo equilátero");
            } else if (a != b && b != c && a != c) {
                IO.println("triângulo escaleno");
            } else {
                IO.println("triângulo isósceles");
            }
        } else {
            IO.println("Não é triângulo");
        }


    }
}
