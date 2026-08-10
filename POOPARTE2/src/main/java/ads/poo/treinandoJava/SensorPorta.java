package ads.poo.treinandoJava;

import java.util.Scanner;

public class SensorPorta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Imagine que você está projetando um sistema de segurança para controle de acesso a uma
//        sala. Para entrar na sala, o usuário deve digitar a senha correta, que é "alfa".

//        (a) Elabore um fluxograma para um algoritmo que LÊ uma string representando uma senha
//        e ESCREVE a mensagem Acesso permitido, se o usuário entrar com a senha correta, ou
//        Acesso negado, caso contrário.

//        (b) Agora, modifique o fluxograma para incluir a verificação de um sensor de porta aberta.
//        Considere que o valor do sensor será LIDO e é booleano: T, se a porta estiver aberta,
//        ou F, se a porta estiver fechada. O sistema deverá acionar a abertura da porta (ESCREVER
//        Acionando abertura da porta) somente se ela estiver fechada.
//         Obs.: Não implemente iteração (loops) neste exercício; isso será abordado no exercício 17.

        IO.print("senha ");
        String senha = sc.nextLine();

        String senhaCorreta = "alfa";

        if (senha.equals(senhaCorreta)) {
            IO.println("Acesso permitido...");
            IO.println("Porta esta aberta (true ou false)");
            boolean sensor = sc.nextBoolean();
            if (!sensor) {
                IO.println("Abrindo porta...");
            } else {
                IO.println("Porta ja está aberta");
            }
        } else {
            IO.println("Acesso negado...");
        }




    }
}
