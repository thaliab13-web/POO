package treinandoEmCasa;

public class Lampada {

    private boolean ligada;

     boolean isLigar() {
       ligada = true;
       return ligada;
    }
    

    boolean isDesligar() {
      ligada = false;
      return ligada;
    }

    public void mostrarDados() {
        IO.println("Lampada está: " + ligada);
    }


}
