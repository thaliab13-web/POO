package ads.poo.cartas;

public class Valor {
    AS(1, '1'),
    DOIS(2, '2'),
    TRES(3, '3'),
    QUATRO(4, '4'),
    CINCO(5, '5'),
    SEIS(6, '6'),
    SETE(7, '7'),
    OITO(8, '8'),
    NOVE(9, '9'),
    DEZ(10, '10'),
    DAMA(11, 'j'),
    VALETE(12, 'g'),
    REIS(13, 'k');

    private final int valor;
    private final char inicia;

    public Valor(int valor, char inicia) {
        this.valor = valor;
        this.inicia = inicia;
    }
}
