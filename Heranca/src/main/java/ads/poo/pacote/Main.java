package ads.poo.pacote;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Dimensao dimensao = new Dimensao(2.50, 1.55, 3.00);
        Telefone telefone1 = new Telefone(2, "66", 2.66, "MA", dimensao);
        SemFio semFio = new SemFio(55, "88", 9.7, "AKL", dimensao, 4.44, 3.09, 578);
        IO.println(telefone1);
        IO.println(semFio);

    }
}
