import java.util.InputMismatchException;import java.util.Scanner;

static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a, b;

    try{
        System.out.print("Entre com o numero: ");
        a = ler.nextInt();
        System.out.print("Entre com o numero: ");
        b = ler.nextInt();

        int res = a / b;

        System.out.println(a + " divido por " + b + " = " + res);

        // Operação matematica inválida, divisão por zero
    }catch (ArithmeticException e) {
        System.out.println("Erro: divisão com zero não é permitido");
   // Tipo de dado digitado não corresponde ao esperado
    }catch (InputMismatchException e){
        System.out.println("So e permitido numeros inteiros");
        ler.nextLine(); // limpar o buffer
    }

    System.out.println("Fim do programa");
    ler.close();
}