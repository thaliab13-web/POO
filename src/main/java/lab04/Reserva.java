package lab04;

public class Reserva {
    private Voo voo;
    private Passageiro passageiro;
    public Reserva(Voo voo, Passageiro passageiro) {
        this.voo = voo;
        this.passageiro = passageiro;
    }

    @Override
    public String toString() {
        return String.format(
                """
                        Voo 
                        %s
                        Passageiro 
                        %s
                        """,
                voo,
                passageiro
        );
    }
}
