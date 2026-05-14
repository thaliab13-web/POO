package ads.poo.pacote;

import ads.poo.pacote.Dimensao;

public class Telefone {
    int codigo;
    protected String numSerie;
    protected String modelo;
    protected double peso;
    protected Dimensao dimensao;

    public Telefone(int codigo, String numSerie, double peso, String modelo, Dimensao dimensao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.peso = peso;
        this.modelo = modelo;
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return String.format(
                """
                Codigo: %s
                Numero Série: %s
                Peso: %.2f
                Modelo: %s
                Dimensao: %s
                """,
                codigo,
                numSerie,
                peso,
                modelo,
                dimensao
        );
   }
}
