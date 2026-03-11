package aula05;
// Define o pacote onde essa classe está organizada.
// Pacotes servem para organizar classes dentro do projeto.

public class MainAula1POO {
    public static void main(String[] args) {

        Caneta caneta1 = new Caneta();

        caneta1.setCor("Vermelha");
        caneta1.setNivelTinta(0.001);

        String cor = caneta1.getCor();

        caneta1.abrirTampa();
        IO.println(caneta1.getNivelTinta());
        IO.println(caneta1.desenhar(1,1,1,2));
        IO.println(caneta1.getNivelTinta());


    }
    }

