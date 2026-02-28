public class FormatandoString {

    public static void main(String[] args) {

        System.out.println("Pequenos exemplos de formatação de Strings");
        System.out.println("===============================================");

        String s;

        // Olá Juca, aula de POO
        s = String.format("Olá %s, aula de %s", "Juca", "POO");
        System.out.println(s);
        System.out.println("===============================================");

        // Largura de campo de 8 caracteres e precisão de 2 caracteres
        s = String.format("PI: %8.2f, sem máscara: %f", Math.PI, Math.PI);
        System.out.println(s);
        System.out.println("===============================================");

        // Preenche com zeros
        s = String.format("%06d", 123);
        System.out.println(s);
        System.out.println("===============================================");

        // Largura de 10 caracteres
        s = String.format("%5d", 123);
        System.out.println(s);
        System.out.println("===============================================");

        // Alinha á esquerda
        s = String.format("%-5d", 123);
        System.out.println(s);
        System.out.println("===============================================");

        // inteiro em octal
        s = String.format("%o", 123);
        System.out.println(s);
        System.out.println("===============================================");

        // inteiro em hexadecimal
        s = String.format("%x", 123);
        System.out.println(s);

        System.out.println("===============================================");

        System.out.println("Conversões");
        // Convertendo de String para int

        // parseInt -> Converte uma String em um int
        String idade = "20";
        int i = Integer.parseInt(idade);
        System.out.println(i);
        System.out.println("===============================================");

        // Convertendo de int p/ String

        // Integer -> Representa um número inteiro como objeto
        // toString -> converte o número (int, double) em texto
        String a = Integer.toString(i);
        System.out.println(a);
        System.out.println("===============================================");

        // valueOf -> transforma qualquer tipo em String
        String b = String.valueOf(i);
        System.out.println(b);
        System.out.println("===============================================");

        // %d -> numero inteiro decimal
        String c = String.format("%d", i);
        System.out.println(c);
        System.out.println("===============================================");

        // Concatenação
        String d = "" + i;
        System.out.println(d);
        System.out.println("===============================================");

        // Divisão de inteiros sempre gera inteiros
        double res = 1 / 2;
        System.out.println(res);
        System.out.println("===============================================");

        // Coerção de tipos (typecasting)
        
        // typecasting -> Muda o tipo de uma variavel Forçando (double)
        double r = (double) 1 / 2;
        System.out.println(r);
        System.out.println("==================================================");

        // Método round retorna um long
        int j = (int) Math.round(4.5632);
        System.out.println(j);

        System.out.println("==================================================");

        System.out.println("Concatenação de Strings com a classe StringBuilder");

        // A classe String é imutável e não deve ser usada para concatenar várias String 

    }
}