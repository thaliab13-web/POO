package aula16;

public class Main {

    static void main(String[] args) {


        Aviao aviao = new Aviao(2, 10, 15,"turbina", 4);


        IO.println("Quantidade de Motores: "  + aviao.getMotores().size());
        aviao.verStatus();
        IO.println();

        IO.println("Ligando todos os motores");
        aviao.ligar();
        aviao.verStatus();
        IO.println();

        IO.println("Desligando todos os motores");
        aviao.desligar();
        aviao.verStatus();
        IO.println();

        IO.println("Ligar o motor 2 ");
        aviao.ligarMotor(2);
        aviao.verStatus();





















//        MotorCarro motorCarro1 = new MotorCarro();
//        Carro carro = new Carro("BWN", motorCarro1);
//        IO.println();
//        carro.acelerar(10);
//
//        MotorCarro motorCarro2 = new MotorCarro();
//        Carro carro2 = new Carro("Toyota", motorCarro2);
//        carro.trocarMotor(motorCarro2);
//        IO.println();
//        carro2.acelerar(20);


//        // Agregação = usar um objeto que já existe
//        Livro livro = new Livro("Java - UML", new PessoaAutor("Thalia", "123106", "Lara@gmail.com"));
//
//        // ou
//
////        PessoaAutor autor = new PessoaAutor("Thalia", "123106", "Lara@gmail.com");
////        Livro livro = new Livro("Java", autor);
//
//        livro.adicionaCapitulo("Parte1");
//        livro.adicionaCapitulo("Parte2");
//        livro.adicionaCapitulo("Parte3");
//        livro.adicionaCapitulo("FIM");
//
//        IO.println(livro);

    }
}
