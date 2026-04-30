package lab17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

    // Criando uma variavel-objeto,
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
        String dataNascStr = IO.readln("Data nascimento: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(dataNascStr, formatter);
        var contato = new Contato(nome, sobrenome, dataNasc);

        String opc;
        do {
            var rotulo = IO.readln("Rótulo do telefone (cómercial, pessoal): ");
            var numero = IO.readln("Número: ");

            contato.addTelefone(rotulo,numero);

            opc = IO.readln("Adicionar outro Telefone (s/n)? ");
        }while (opc.equalsIgnoreCase("s"));

        do {
            var rotulo = IO.readln("Rótulo do email (cómercial, pessoal): ");
            var email = IO.readln("Email: ");

            // verificando se o email é válido
           if(!contato.addEmail(rotulo,email)) {
              IO.println("Email inválido");
           }
            opc = IO.readln("Adicionar outro Email (s/n)? ");
        } while (opc.equalsIgnoreCase("s"));

        if (this.agenda.adicionarContato(contato)){
            IO.println("Adicionado com sucesso!");
        }else{
            IO.println("Não foi possivel adicionar o contato!");
        }

    }

    void removerContato() {
        var nome = IO.readln("Nome: ");
        var sobrenome = IO.readln("Sobrenome: ");
        var contatoEncontrado = agenda.encontrarContato(nome, sobrenome);

        // is.Empty() verifica se a lista esta vazia
        if (contatoEncontrado.isEmpty()) {
            IO.println("Contato não encontrado");
            return;
        }
        //pega o primeiro elemento da lista encontrarContato
        Contato c = contatoEncontrado.get(0);

        // criando uma variavel para procurar o indice que ele achou em get()
        int indice = agenda.getContatos().indexOf(c);
        agenda.removerContato(indice);

        IO.println("Removido com sucesso!");


    }

    void AtualizarContato() {
        var nome = IO.readln("Nome: ");
        var sobrenome = IO.readln("Sobrenome: ");
        var contatoEncontrado = agenda.encontrarContato(nome, sobrenome);

        // verificando se a lista esta vazia
        if (contatoEncontrado.isEmpty()) {
            IO.println("Contato não encontrado");
            return;
        }
        // pegando o primeiro indice da lista get(0)
        Contato c = contatoEncontrado.get(0);

        // indexOf() descobre a posição na Agenda
        int indiceContatoNaLista = agenda.getContatos().indexOf(c);

        // atualiza (telefone, email)
        int opcao;
        do {
             opcao = Integer.parseInt(IO.readln("""
                            1 - Atualizar telefone
                            2 - Atualizar email
                            0 - Sair
                        """));
            if (opcao == 1) {
                var rotulo = IO.readln("Rótulo: ");
                var numero = IO.readln("Novo número: ");

                if (agenda.updateTelefone(rotulo, numero, indiceContatoNaLista)) {
                    IO.println("Telefone atualizado! ");
                } else {
                    IO.println("Erro ao atualizar telefone");
                }
            } else if (opcao == 2) {
                var rotulo = IO.readln("Rótulo: ");
                var numero = IO.readln("Novo email: ");

                if(agenda.updateEmail(rotulo, numero, indiceContatoNaLista)) {
                    IO.println("Email atualizado");
                } else {
                    IO.println("Erro ao atualizar email");
                }
            } else {
                IO.println("Opção inválida");
            }
        } while (opcao != 0); // diferente de zero faz
    }

    void listarContato() {
        var nome = IO.readln("Nome: ");
        var sobrenome = IO.readln("Sobrenome: ");
      // retornando a lista de contatos encontrados com ese nome e sobrenome
        var contatoEncontrado = agenda.encontrarContato(nome,sobrenome);

        //ver se a lista não está vazia
        if (contatoEncontrado.isEmpty()) {
            IO.println("Contato não encontrado");
            return;
        }
        // Pegando primeiro indice da lista
        Contato c = contatoEncontrado.get(0);
        IO.println(c);

    }

    void listarTodosContatos() {
        //pegando a lista de contatos com lista.getContatos
        for (Contato c : agenda.getContatos()) {
            IO.println(c);
        }
    }

    static void main(String[] args) {
        App app = new App();
        app.menu();
    }
}
