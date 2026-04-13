package aula15;

import java.util.HashMap;


public class Acervo {

    // Sistema de uma livraria para gestão de acervo
    // 1 - Cadastrar livro
    // 2 - Listar todos os livros
    // 3 - Listar todos os livros publicados em um ano especifico
    // 4 - Alterar dados de um livro
    // 5 - Sair

    HashMap<String, Livro> livros;

    // Construtor sem parametros que inicializa dados
    public Acervo() {
        this.livros = new HashMap<>();

        livros.put("123", new Livro("123","Acoisa", "2010", "Lopo"));
        livros.put("456", new Livro("456", "Bomba", "2020", "Rea"));
        livros.put("789", new Livro("789", "Juizo", "2022", "Zé"));
        livros.put("1011", new Livro("1011", "Terra", "2024", "Pereira"));

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
                    listarLivros();
                    break;
                case 3:
                    listaLivroAnoPublicado();
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
        Livro novoLivro = new Livro(ISBN, nomeLivro, anoLancamento, autor);

        // verificando se já existe essa chave ISBN
        // containsKey -> verifica se a chave existe no map
        if (livros.containsKey(ISBN)) {
            IO.println("Essa chave já existe!");
        } else {
            // pego o meu Map e cadastro "put" uma nova chave para o novo livro
            livros.put(ISBN, novoLivro);
            IO.println("Livro cadastrado!");
        }
    }
    // ele chama o toString
    // Método listar todos os livros
    void listarLivros() {
        livros.values().forEach(System.out::println);
    }

    // 3 - Listar todos os livros publicados em um ano especifico
    void listaLivroAnoPublicado() {

        var anoLivroPublicado = IO.readln("Ano do livro especifico: ");

        // ainda não encontrei nenhum livro
        boolean encontrou = false;

        // pega todo os livros e vai um por um
        // values(): Pega o conjunto de objetos (Livro)
        // Livro livro: A variável temporária para a iteração.
        for (Livro livro : livros.values()) {

            // Verifica se esse ano do livro é oq eu quero
            if (livro.getAnoLancamento().equals(anoLivroPublicado)) {
                IO.println(livro);
                encontrou = true;
            }
        }
        // eu não encontrei nenhum livro?
        if (!encontrou) {
            IO.println("Nenhum livro desse ano.!");
        }
    }

    // 4 - Alterar dados de um livro
    void alterarDadosLivros(){
    }


    // Método pra chamar o menu de interação
    static void main(String[] args) {
        Acervo app = new Acervo();
        app.menu();
    }

}

