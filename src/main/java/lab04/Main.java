package lab04;

import java.time.LocalDate;

public class Main {

    static void main(String[] args) {

        Produto p = new Produto("Pão", 17.99, 15);

        ItemPedido item = new ItemPedido(5,1.52,p);

        Cliente cliente = new Cliente("Tha", "lara@gmail.com");

        Endereco e = new Endereco("123", "lo", "co", "cida", "rl", "casa");

        Pedido pedido = new Pedido(LocalDate.now(), StatusPedido.PENDENTE);

        pedido.addItem(item);
        cliente.addEndereco(e);
        cliente.addPedido(pedido);

        IO.println(cliente);

    }
}
