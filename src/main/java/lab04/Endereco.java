package lab04;

public class Endereco {
    private String cep;
    private String bairro;
    private String logradouro;
    private String cidade;
    private String rua;
    private String complemento;

    public Endereco(String cep, String bairro, String logradouro, String cidade, String rua, String complemento) {
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.rua = rua;
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return String.format(
                """
                CEP: %s
                Bairro: %s
                Logradouro: %s
                Cidade: %s
                Rua: %s
                Complemento: %s
                """,
                cep,
                bairro,
                logradouro,
                cidade,
                rua,
                complemento
        );
    }
}
