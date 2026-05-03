package lab04;

import java.time.LocalDate;

public class Main {

    static void main(String[] args) {

        Diretor diretor = new Diretor("Robibi", "email@.com");
        Filme filme = new Filme("Foi será menina?", 2010, "Alegre", diretor);
        Usuario usuario = new Usuario("Thalia", "email@.com", "senha123");
        Avaliacao avaliacao = new Avaliacao(2, "Ai não sei oq nanana", usuario, filme);
        LocalDate dataNascimento = LocalDate.of(2000,6,21);
        Ator ator = new Ator("Luz", dataNascimento);

        filme.addAtor(ator);
        filme.addAvaliacao(avaliacao);
        IO.println(filme);

//        Produto p = new Produto("Pão", 17.99, 15);
//
//        ItemPedido item = new ItemPedido(5,1.52,p);
//
//        Cliente cliente = new Cliente("Tha", "lara@gmail.com");
//
//        Endereco e = new Endereco("123", "lo", "co", "cida", "rl", "casa");
//
//        Pedido pedido = new Pedido(LocalDate.now(), StatusPedido.PENDENTE);
//
//        pedido.addItem(item);
//        cliente.addEndereco(e);
//        cliente.addPedido(pedido);
//
//        IO.println(cliente);

    }
}
