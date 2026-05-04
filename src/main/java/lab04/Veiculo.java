package lab04;

public class Veiculo {
    private  String modelo;
    private String placa;
    private int anoFabricacao;

    public Veiculo(String modelo, String placa, int anoFabricacao) {
        this.modelo = modelo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }
    public String getPlaca() {
        return placa;
    }
    public void setModelo(String novoModelo) {
        this.modelo = novoModelo;
    }

    @Override
    public String toString() {
        return String.format(
                """
                        Modelo: %s
                        Placa: %s
                        Ano de Fabricação: %d
                        """,
                modelo,
                placa,
                anoFabricacao
        );
    }
}
