package aula16;

public class Main {

    static void main(String[] args) {


        Aviao aviao = new Aviao(2, 10, 15,"turbina", 8);


        IO.println("...Inicialização...");
        IO.println("Quantidade de Motores: "  + aviao.getMotores().size());
        aviao.verStatus();
        IO.println();

        IO.println("Ligando Avião (todos os motores)");
        aviao.ligar();
        aviao.verStatus();
        IO.println();

        IO.println("Desligando Avião (todos os motores)");
        aviao.desligar();
        aviao.verStatus();
        IO.println();

        IO.println("Ligar o motor individual (posição 3) ");
        aviao.ligarMotor(2);
        aviao.verStatus();
        IO.println();

        aviao.desligar();


        IO.println("Ligar o motor individual (posição 8) ");
        aviao.ligarMotor(7);
        aviao.verStatus();
        IO.println();

        IO.println("Teste de erro (motor inválido) ");
        aviao.ligarMotor(10);
        IO.println();





















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
