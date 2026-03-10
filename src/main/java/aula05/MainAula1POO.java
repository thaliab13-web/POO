package aula05;
// Define o pacote onde essa classe está organizada.
// Pacotes servem para organizar classes dentro do projeto.

public class MainAula1POO {
// Declaração da classe principal do programa.

    static void main(String[] args) {
        // Método principal (main) onde o programa começa a executar.
        // static permite executar sem criar objeto da classe Main.

        // Instanciando a classe
       // Lampada lampada1  = new Lampada();
        // Cria um objeto chamado lampada1 da classe Lampada.

        //Lampada lampada2 = new Lampada();
        // Cria outro objeto da mesma classe Lampada.

        //lampada1.ligarDesligar();
        // Chama o método ligarDesligar() do objeto lampada1.
        // Esse método provavelmente altera o estado da lâmpada (ligada/desligada).
       /// IO.println(lampada1.isLigada());
        // Imprime no console se a lampada1 está ligada ou desligada.
        // isLigada() deve retornar true ou false.

        //IO.println(lampada2.isLigada());
        // Mostra o estado da lampada2.
        // Como não chamamos ligarDesligar() nela, provavelmente estará desligada.

        Caneta caneta1 = new Caneta();
        // Cria um objeto chamado caneta1 da classe Caneta.

        caneta1.setCor("Azul");
        // Define a cor da caneta como Azul usando o método setter.

        caneta1.setNivelTinta(0.001);
        // Define o nível de tinta da caneta

        String cor = caneta1.getCor();

      // caneta1.abrirTampa();
        caneta1.fecharTampa();
        IO.println(caneta1.getNivelTinta());
        IO.println(caneta1.desenhar(1,1,1,2));
        IO.println(caneta1.getNivelTinta());
    }
}