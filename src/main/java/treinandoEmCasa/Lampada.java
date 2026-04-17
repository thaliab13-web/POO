package treinandoEmCasa;

public class Lampada {

    private boolean ligada;

     boolean isLigar() {
       ligada = true;
       return ligada;
    }
    

    boolean isDesligar() {
      ligada = false;
      return false;
    }

    public void mostrarDados() {
        IO.println("Lampada está: " + ligada);
    }


}
