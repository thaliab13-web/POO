package aula16;

public class Main {

    static void main(String[] args) {
        MotorAviao motor = new MotorAviao("tubina", false);
        Aviao aviao = new Aviao(2, 7, 10.50);

        aviao.adicionarMotor(motor);
        aviao.ligarAviao();
        aviao.desligarMotor(0);
        IO.println(aviao);













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
