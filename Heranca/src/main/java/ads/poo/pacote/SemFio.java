package ads.poo.pacote;

public class SemFio extends Telefone {
    private double frequencia;
    private int canais;
    private double distancia;

    public SemFio(int codigo, String numSerie, double peso, String modelo, Dimensao dimensao, double frequencia, double distancia, int canais) {
        super(codigo, numSerie, peso, modelo, dimensao); // invocando o construtor da superclasse
        this.frequencia = frequencia;
        this.distancia = distancia;
        this.canais = canais;
    }
    @Override
    public String toString() {
        // TODO melhorar a String gerada
        return String.format(
                super.toString() +
                        """
                        Freque: %.2f
                        Canais: %d
                        Distancia: %.2f
                        """,
                frequencia,
                canais,
                distancia

        );
    }
}
