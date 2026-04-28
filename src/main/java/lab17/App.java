package lab17;

import java.time.LocalDate;

public class App {

    private Agenda agenda;

    public App() {
        this.agenda = new Agenda();
    }

    void menu() {
        int opcao;
        do {
            IO.println();
            opcao = Integer.parseInt(IO.readln( """
                    Entre com a opção: 
                    1 - Adicionar Contato
                    2 - Remover Contato
                    3 - Atualizar Contato 
                    4 - Listar Contato
                    5 - Listar Todos os Contatos
                    6 - Sair
                       """ ));
            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    removerContato();
                    break;
                case 3:
                    AtualizarContato();
                    break;
                case 4:
                    listarContato();
                    break;
                case 5:
                    listarTodosContatos();
                    break;
                case 6:
                    IO.println("Encerrando sistema");
                    break;
                default:
                    IO.println("Opção inválida. Tente novamente");
                    break;

            }

        }while (opcao != 6);
    }
    void adicionarContato() {
        var nome = IO.readln("Nome: ");
        var sobrenome = IO.readln("Sobrenome: ");
//        LocalDate data = LocalDate.parse(d
        var dataNasc = IO.readln("Data nascimento: ");

        var contato = new Contato(nome, sobrenome, dataNasc);
        if ( this.agenda.adicionarContato(contato)){
            IO.println("Adicionado contato com sucesso!");
        }else{
            IO.println("Sem sucesso!");
        }
    }

    static void main(String[] args) {
        App app = new App();
        app.menu();
    }
}
