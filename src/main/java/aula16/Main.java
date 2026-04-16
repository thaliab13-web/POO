package aula16;

public class Main {

    static void main(String[] args) {

        Motor motor1 = new Motor();
        Carro carro = new Carro("BWN", motor1);
        IO.println();
        carro.acelerar(10);

        Motor motor2 = new Motor();
        Carro carro2 = new Carro("Toyota", motor2);
        carro.trocarMotor(motor2);
        IO.println();
       carro2.acelerar(20);









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
