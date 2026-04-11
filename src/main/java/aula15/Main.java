package aula15;

import java.util.HashMap;
import java.util.Map;

public class Main {

    // Sistema de uma livraria para gestão de acervo
    // 1 - Cadastrar livro
    // 2 - Listar todos os livros
    // 3 - Listar todos os livros publicados em um ano especifico
    // 4 - Alterar dados de um livro
    // 5 - Sair

    HashMap<String, Livro> livro;

    // Construtor
    public Main() {
        this.livro = new HashMap<>();

        livro.put("123", new Livro("123","Acoisa", "2010", "Lopo"));
        livro.put("456", new Livro("456", "Bomba", "2020", "Rea"));
        livro.put("789", new Livro("789", "Juizo", "2022", "Zé"));
        livro.put("1011", new Livro("1011", "Terra", "2024", "Pereira"));

    }
    void menu() {
        int opcao;
        do {
            IO.println();
            opcao = Integer.parseInt(IO.readln("""
                    1 -  Cadastrar livro
                    2 - Listar todos os livros
                    3 - Listar todos os livros publicados em um ano especifico
                    4 - Alterar dados de um livro
                    5 - Sair
                    """));
            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    IO.println("Valor incorreto, tente novamente!");
            }
        } while(opcao != 5);
    }

    // metodo cadastrar livro
    void cadastrarLivro() {
        var ISBN = IO.readln("ISBN: ");
        var autor = IO.readln("Autor: ");
        var anoLancamento = IO.readln("Ano lançamento: ");
        var nomeLivro = IO.readln("Nome do livro: ");

        // Criando um novo livro
        Livro Novolivro = new Livro(ISBN, nomeLivro, anoLancamento, autor);

        // guardando o livro dentro da lista
        livro.put(ISBN, Novolivro);

        IO.println("Livro cadastrado!");
    }

    // Método listar todos os livros
    void listaLivros() {
        livro.forEach((ISBN, livro) -> {
            IO.println();
        });

    }
}
