package aula16;


import java.util.ArrayList;

public class Livro {

    private String titulo;
    private PessoaAutor autor; // Composição

    // lista com vários capitulos
    private ArrayList<Capitulo> capitulos;

    // Construtor com Agregação
    public Livro(String titulo, PessoaAutor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
    }

    // Composição, o livro cria objetos Capitulos e guarda dentro dele
    public void adicionaCapitulo(String titulo) {
        // crie um novo objeto Capitulo com titulo...
        var capitulo = new Capitulo(titulo);
        // Adiciona esse capitulo dentro da lista de capitulos do livro
        this.capitulos.add(capitulo);
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        // percorre a lista capitulos e adiciona capitulo dentro da StringBuilder
        // lambda
        //this.capitulos.forEach(capitulo -> sb.append(capitulo));

        // :: é o operador de referência de método
        // objeto::metodo ou Classe::metodo
        // Percorre a lista capitulos e adiciona cada elemento no StringBuilder usando o append
        this.capitulos.forEach(sb::append);

        return String.format("""
         Livro: %s
         %n
         Autor do Livro
         %s
         Capitulos:
         %s
        """, titulo, autor, sb.toString());

    }


}
