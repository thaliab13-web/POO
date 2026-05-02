package lab04;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private LocalDate data;
    private StatusPedido status;
    private ArrayList<ItemPedido> itens;

    public Pedido(LocalDate data, StatusPedido status) {
        this.data = data;
        this.status = status;
        this.itens = new ArrayList<>();
    }
    public void addItem(ItemPedido item) {
        itens.add(item);
    }

    @Override
    public String toString() {
        return String.format(
                """
                Data: %s
                Status: %s
                Itens: %s
                """,
                data,
                status,
                itens
        );
    }
}
