package aula15;

import java.util.ArrayList;

public class App {

    /* definindo a variavel contas, ela será uma lista dinamica  */
    /* <Conta> indica que esta lista foi criada pra guarda objeto Conta*/
    private ArrayList<Conta> contas;

    /* Construtor prepara o objeto pra uso */
    public App() {
        this.contas = new ArrayList<>();
        /* crie uma lista vazia de contas e guarde dentro do App*/
    }

    void menu() {
        int opcao;
        do {
            IO.println();
            opcao = Integer.parseInt(IO.readln("""
            Entre com a opção:
             1 - Cadastrar conta 
             2 - Listar contas 
             3 - Depositar 
             4 - Sacar 
             5 - Sair
             """));

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listarContas();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    sacar();
                    break;
                case 5:
                    IO.println("Encerrando sistema!");
                    break;
                default:
                    IO.println("Opção inválida. Tente novamente");
                    break;
            }
        } while (opcao != 5);
    }

    /* método cadastrar */
    void cadastrar() {
        var titular = IO.readln("Nome do titular: ");
        var numeroConta = IO.readln("Número da conta: ");
        var saldo = Double.parseDouble(IO.readln("Saldo inicial: "));

        /* Criando uma conta nova */
        Conta conta = new Conta(titular, numeroConta, saldo);

        /* guardando a conta dentro da lista */
        contas.add(conta);

        IO.println("Conta cadastrada com sucesso!");
    }

    /* método listar contas */
    void listarContas() {

        /* Para cada conta da lista, mostra ela na tela */
        /* c é o item atual da lista (conta1, conta2,...*/
        for (Conta c : contas) {
            IO.println(c.toString());
        }

//        contas.forEach(c -> IO.println(c));

//        contas.forEach(IO::println);
    }

//     Descobrir qual conta p usuario quer
//    Encontrar essa conta na lista
//    Fazer o depósito nela

    void depositar() {
        String numero = IO.readln("Número da conta: ");

        /* for passa por TODAS as contas */
        for (Conta c : contas) {
            // Se o número dessa conta for igual ao número digitado
            if (c.getNumeroConta().equals(numero)) {
                double valor = Double.parseDouble(IO.readln("Valor de Depósito? "));
                c.depositar(valor); // Conta c, adiciona esse valor no saldo
                IO.println(String.format("Depósito de %.2f realizado!", valor));
                IO.println(String.format("Saldo atual: %.2f", c.getSaldo()));

                // return quebra o for
                return;
            }
        }
        IO.println("Conta não encontrada!");
    }


    // método sacar valor
    void sacar() {
        String numero = IO.readln("Número da conta: ");

        // Para cada Conta 'c' dentro de contas
        for (Conta c : contas) {
            if (c.getNumeroConta().equals(numero)) {
                double valor = Double.parseDouble(IO.readln("Valor do Saque? "));
                c.sacar(valor);
                IO.println(String.format("Saque de %.2f realizado!", valor));
                IO.println(String.format("Saldo atual: %.2f", c.getSaldo()));
                return;
            }
        }
        IO.println("Conta não encontrada!");
    }

    // chamando minhas funções desejada
    static void main(String[] args) {
        App app = new App();
        app.menu();

        // ..:: Menu ::..
        // 1 - Cadastarr conta
        // 2 - Listar todas contas
        // 3 - Depositar em uma conta
        // 4 - sacar de uma conta
        // 5 - Sair

    }
}
