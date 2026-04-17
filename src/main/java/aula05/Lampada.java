package aula05;

public class Lampada {

    // Atributos
    private boolean ligada;

    // retonar o metodo coloca o nome is na frente isLigada
    // Métodos
    // tipo de retorno
    boolean isLigada() {
        return ligada;
    }

    boolean ligarDesligar(){
        return ligada = !ligada;
    }



    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Motor ligado com sucesso.");
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    // Método para desligar o motor
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    // Verifica o estado atual
    public boolean isLigado() {
        return ligado;
    }
}

}
