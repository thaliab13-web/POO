package aula16;

public class Main {

    static void main(String[] args) {

        // Agregação = usar um objeto que já existe
        Livro livro = new Livro("Java - UML", new PessoaAutor("Thalia", "123106", "Lara@gmail.com"));

        // ou

//        PessoaAutor autor = new PessoaAutor("Thalia", "123106", "Lara@gmail.com");
//        Livro livro = new Livro("Java", autor);

        livro.adicionaCapitulo("Parte1");
        livro.adicionaCapitulo("Parte2");
        livro.adicionaCapitulo("Parte3");
        livro.adicionaCapitulo("FIM");

        IO.println(livro);

    }
}
