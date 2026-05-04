package lab04;

import java.time.LocalDate;

public class Registro {
    private LocalDate data;
    private double distancia;
    private Veiculo veiculo;
    private Motorista motorista;

    public Registro(LocalDate data, double distancia, Veiculo veiculo, Motorista motorista) {
        this.data = data;
        this.distancia = distancia;
        this.veiculo = veiculo;
        this.motorista = motorista;
    }
    @Override
    public String toString() {
        return String.format(
                """
                        Data: %s
                        Distancia: %.2f
                        Veiculo:
                        %s
                        Motorista: 
                        %s
                        """,
                data,
                distancia,
                veiculo,
                motorista
        );
    }
}
