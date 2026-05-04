package lab04;

import java.time.LocalDate;
import java.time.LocalTime;

public class Voo {
    private int numero;
    private String destino;
    private LocalDate data;
    private LocalTime horaPartida;
    private int capacidadeMax;

    public Voo(int numero, String destino, LocalDate data, LocalTime horaPartida, int capacidadeMax) {
        this.numero = numero;
        this.destino = destino;
        this.data = data;
        this.horaPartida = horaPartida;
        this.capacidadeMax = capacidadeMax;
    }
    @Override
    public String toString() {
        return String.format(
                """
                        Número: %d
                        Destino: %s
                        Data: %s
                        Hora de Partida: %s
                        Capacidade máxima de passageiros: %d
                        """,
                numero,
                destino,
                data,
                horaPartida,
                capacidadeMax
        );
    }
}
