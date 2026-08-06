package ads.poo.treinandoJava;

public class TemperaturaFahrenheit {
    public static void main(String[] args) {

//       Faça um algoritmo que LÊ um número real representando uma temperatura em graus Fahrenheit e ESCREVE esta temperatura em graus Celsius. Lembre-se que para converter de Fahrenheit para Celsius, basta subtrair 32 e multiplicar por 5/9 . Em seguida, execute um teste de mesa com a entrada 100; a saída deve ser 37.7778.


        String tempF = IO.readln("Temperatura em Fahrenheit: ");
        double fahr = Double.parseDouble(tempF);

        double celsius = (fahr - 32) * 5 / 9;

        IO.println(Math.round(celsius));
    }

}
