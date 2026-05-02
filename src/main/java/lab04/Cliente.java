package lab04;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String email;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.enderecos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    public void addEndereco(Endereco e) {
        enderecos.add(e);
    }
    public void addPedido(Pedido p) {
        pedidos.add(p);
    }
    @Override
    public String toString() {
        return String.format(
                """
                Nome: %s
                Email: %s
                Endereços: %s
                Pedidos: %s
                """,
                nome,
                email,
                enderecos,
                pedidos
        );
    }
}
