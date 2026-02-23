

public class ClasseString {

    public static void main(String[] args) {

        // Métodos isEmpty, equals, length e repeat

        // Criando uma String com o valor "Engenharia"

        String s = "Engenharia";

        if (s.isEmpty()) { // verifica se está vazia
            System.out.println("Vazia");
        } else if (s.equals("Engenharia")) { // para comparar Strings
            System.out.println("Iguais");
        }
        System.out.println("=============================================");
        // Obtém o tamanho da String
        int tamanho = s.length();
        System.out.println("Obtém o tamanho da String: " + tamanho);
        System.out.println("=============================================");

        // Concatenando Strings
        String nova = s + " de Telecomunicação. Concatenando Strings";
        System.out.println(nova);
        System.out.println("=============================================");

        // Repetindo uma String
        String repetida = "Java".repeat(3);
        System.out.println(repetida);
        System.out.println("=============================================");



        // Métodos charAt, substring e split

        // Obtém o caractere na posição 1
        char c = s.charAt(1);
        System.out.println(c + ".Obtém o caractere na posição 1");
        System.out.println("=============================================");

        // Obtém uma substring com os 4 primeiros caracteres
        String sub = s.substring(0,4);
        System.out.println(sub + ". 4 primeiros caracteres");
        System.out.println("=============================================");


        // Uma String com nomes de alunos separados por ":"
        String alunos = "João:Pedro:Ana";
        System.out.println(alunos);        
        System.out.println("=============================================");

        // Dividindo a String em um vetor de String
        // O método split recebe um caractere ou uma expressão regular
        // Neste caso, o caracter ":" é usado para dividir a String e o resultado é armazenado em vetAlunos

        String[] vetAlunos = alunos.split(":");

        // Acessando o primeiro elemento do vetor, que é "João"
        System.out.println(vetAlunos[1]);
        
    }
}