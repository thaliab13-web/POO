package lab03;

public class Main {
    static void main() {

        Retangulo r1 = new Retangulo(2,5, "ASCII");
        IO.println("R1 --> Área: " + r1.area());
        IO.println("Largura: " + r1.getLargura());
        IO.println("Largura: " + r1.getLargura());
        IO.println(r1);

        // valor da largura vai ser 4 e altura 3
        Retangulo r2 = new Retangulo();
        IO.println("R2 --> Área: " + r2.area());
        IO.println(r2);

        Retangulo r3 = new Retangulo(-3, 0, "ERRADO0");
        // Corrigindo com os valores da condição da classe Retangulo
        IO.println("R3 --> Largura " + r3.getLargura());
        IO.println("R3 --> Altura " + r3.getAltura());
        IO.println("R3 --> Codificação " + r3.getCodi());
        IO.println();

        // testando set
        Retangulo r4 = new Retangulo();

        r4.setLargura(10);
        r4.setAltura(5);
        r4.setCodi("UTF8");
        IO.println("R4 --> Área: " + r4.area());
        IO.println(r4);





//
//        Horario h1 = new Horario(10, 5, 3);
//        Horario h2 = new Horario(8,6,0);
//
//        // testando toString
//        IO.println("Horário 1: " + h1);
//        IO.println("Horário 2: " + h2);
//
//        // testando por extenso
//        IO.println("Por extenso h1: " + h1.porExtenso());
//
//        // testando set
//        boolean mudou = h1.setHora(15);
//        IO.println("Mudou a hora? " + mudou);
//        IO.println("Novo h1: " +h1);
//
//        // testando valor inválido
//        mudou = h1.setHora(50);
//        IO.println("Mudou com valor inválido? " + mudou);
//        IO.println("h1 continua: " + h1);
//
//        // diferença
//        long diferenca = h1.diferenca(h2);
//        IO.println("Diferença en segundos: " + diferenca);
//
////
////        Ponto a = new Ponto(1,2);
////        Ponto b = new Ponto(5,6);
////
////        IO.println(a.getDistancia(b));
    }

}
