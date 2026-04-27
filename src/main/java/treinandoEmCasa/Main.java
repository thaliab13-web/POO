package treinandoEmCasa;

public class Main {

    static void main() {



        Autor a1 = new Autor(1, "Mar");
        Autor a2 = new Autor(2, "Thalia");

        Editora editora = new Editora(1, "CU", "SC");

        Edicao ed1 = new Edicao(1, 2010, 256, "codigo", editora);
        Edicao ed2 = new Edicao(2, 2017, 300, "Ala", editora);

        Livro l1 = new Livro(123, "Opa", "PT");
        Livro l2 = new Livro(456, "Logo", "ES");

        // relacionamentos
        l1.adicionarEdicao(ed1);
        l1.adicionarAutor(a1);

        l2.adicionarEdicao(ed2);
        l2.adicionarAutor(a2);

        // exibir
        IO.println(l1);
        IO.println(l2);




















//        Carr carro1 = new Carr("Gol", 150);
//
//        // Velocidade maxima (300) para esse modelo
//        Carr carro2 = new Carr("Ferrari");
//
//
//        // acelerar
//        carro1.acelerar(160);
//        IO.println("Carro1 Gol a velocidade máxima: " + carro1.getVelocidadeMaxima());
//        carro1.frear(20);
//        IO.println("Velocidade Atual do carro1: " + carro1.getVelocidadeAtual());
//
//
//
//        carro2.acelerar(200);
//        IO.println("Carro2 Ferrari a velocidade máxima: " + carro2.getVelocidadeMaxima());
//        carro2.frear(30);
//        IO.println("Velocidade Atual do carro2: " + carro2.getVelocidadeAtual());
//
//
//        for (int i = 0; i < 2; i++) {
//            carro1.acelerar(10);
//            IO.println("Velocidade Atual do carro1: " + carro1.getVelocidadeAtual());
//        }
//
//        for (int i = 0; i < 2; i++) {
//            carro1.frear(20);
//            IO.println("Velocidade Atual do carro1: " + carro1.getVelocidadeAtual());
//
//        }
//

//    public static void main(String[] args) {
//
//        Carro c = new Carro("FUSCA", 80);
//
//        Carro v = new Carro("BMW", 50);
//
//        /* membros (static) estaticos usa direto a classe */
//




//        Pessoa p = new Pessoa("Binho", "1234567891011","tata@gmail.com");
//
//
//        IO.println(p.toString());

//        ContaBancaria c = new ContaBancaria();
//
//        c.setTitular("PJ");
//        c.setNumeroConta(123);
//        c.setSaldo(100.00);
//
//        c.mostrarDados();
//
//        IO.println("Saldo após o Depósito: " + c.depositar(50));
//        IO.println("Saldo após o Saque: " + c.sacar(25));


//        Aluno a = new Aluno();
//
//        a.setNome("Nena");
//        a.setMatricula(1234);
//        a.setNota1(7.8);
//        a.setNota2(3);
//
//        a.mostraDados();
//
//        Produto p = new Produto();
//
//        p.setNome("BWQ");
//        p.setPreco(18.90);
//        p.setQtdEstoque(10);
//
//        p.adicionarEstoque(5);
//        p.removerEstoque(3);
//
//        p.mostrarDados();










//        // instaciando minha classe
//        Cofrinho c1 = new Cofrinho();
//
//        IO.println(c1.colocarMoeda(1.0));
//        IO.println(c1.colocarMoeda(0.50));
//
//       c1.quebrarCofrinho();
//        IO.println(c1.colocarMoeda(0.25));
//
//        IO.println("Valor guardado: " + c1.getValorGuardado());
//
//        // método retorna algo? String, double, boolean, então coloca no main

    }
}
