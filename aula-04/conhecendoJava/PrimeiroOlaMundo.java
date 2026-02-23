public class PrimeiroOlaMundo {

    //Exemplo de código para versão JDK Anterior á 25

// static é algo que pertence á classe, e não a um objeto especifico.

    static String saudacao = "Olá, Mundo!";

    static String outraFormaDeDizerOla() {
        return "Ola, Mundo!";
    }

    public static void main(String[] args) {
        System.out.println("Olá mundo!");

         //Imprimindo a variavel saudacao
        IO.println(saudacao);

        //Imprimindo o retorno do método outraFormaDeDizerOla
        IO.println(outraFormaDeDizerOla());

    }
}