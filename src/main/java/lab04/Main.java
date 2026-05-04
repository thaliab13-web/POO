package lab04;

import java.time.LocalDate;

public class Main {

    static void main(String[] args) {

        Motorista motorista = new Motorista("Thata", "1234567879");
        Veiculo veiculo = new Veiculo("Sei la", "NAOqqq", 2010);
        LocalDate dataRegistro = LocalDate.of(2021,4,12);
        Registro registro = new Registro(dataRegistro, 15.5, veiculo, motorista);
        Empresa empresa = new Empresa();

        empresa.addMotorista(motorista);
        empresa.addVeiculo(veiculo);
        empresa.addRegistro(registro);
        IO.println(empresa);

//-------------------------------------------------------------------------------------------------
        // Exercicio FILME
//        Diretor diretor = new Diretor("Robibi", "email@.com");
//        Filme filme = new Filme("Foi será menina?", 2010, "Alegre", diretor);
//        Usuario usuario = new Usuario("Thalia", "email@.com", "senha123");
//        Avaliacao avaliacao = new Avaliacao(2, "Ai não sei oq nanana", usuario, filme);
//        LocalDate dataNascimento = LocalDate.of(2000,6,21);
//        Ator ator = new Ator("Luz", dataNascimento);
//        filme.addAtor(ator);
//        filme.addAvaliacao(avaliacao);
//        IO.println(filme);
//----------------------------------------------------------------------------------------------


        // Exercicio COMÉRCIO ELETRONICO
//        Produto p = new Produto("Pão", 17.99, 15);
//        ItemPedido item = new ItemPedido(5,1.52,p);
//        Cliente cliente = new Cliente("Tha", "lara@gmail.com");
//        Endereco e = new Endereco("123", "lo", "co", "cida", "rl", "casa");
//        Pedido pedido = new Pedido(LocalDate.now(), StatusPedido.PENDENTE);
//        pedido.addItem(item);
//        cliente.addEndereco(e);
//        cliente.addPedido(pedido);
//        IO.println(cliente);

    }
}
