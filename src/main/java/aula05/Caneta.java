package aula05;

public class Caneta {

    ///  Para criar variaveis usa private

    private String cor;
    // Atributo da classe que guarda a cor da caneta.
    // private significa que só pode ser acessado dentro da própria classe.

    private double nivelTinta;
    // Atributo que guarda o nível de tinta da caneta.

    private boolean aberta; // false
    // Atributo que indica se a caneta está aberta ou fechada.

    // metodo, set para entrar com valor e get é para retornar um valor

    // metodo desenhar e retornar uma string dizendo quanto percorreu
    public String desenhar(int x1, int y1, int x2, int y2){

        if (aberta) {
            // calcular a distancia
            double distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2 - y1,2));
            // Raiz quadrada


            if (nivelTinta <= 0) {
                return String.format("Sem tinta");
            } else  {
                // debitar o nivel de tinta
                nivelTinta -= distancia*0.01;
            }

            // Ex: Desenhei 1cm na cor azul
            return String.format("Desenhei %.2f cm na cor %s", distancia, cor);
        }
        return "caneta está fechada";

    }


    public double getNivelTinta(){
        return nivelTinta;
    }

    public String getCor(){
        return cor;
    }
    // Método GET (getter)
    // Serve para retornar/mostrar o valor da cor da caneta.

    public void setCor(String c) {
        cor = c;
    }
    // Método SET (setter)
    // Serve para definir ou alterar a cor da caneta.

    public void setNivelTinta(double d) {
        nivelTinta = d;
    }
    public void abrirTampa() {
        aberta = true;
    }

    public void fecharTampa() {
        aberta = false;
    }
}