package enum_e_composicao.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {

    }

    public Order(OrderStatus status, Client client) {
        moment = LocalDateTime.now();
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }


    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        Double sumTotal = 0.0;
        for (OrderItem item:items) {
            sumTotal += item.subTotal();
        }
        return sumTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n");
        sb.append("Order status: ");
        sb.append(getStatus() + "\n");
        sb.append(getClient().toString() + "\n");
        sb.append("Order items:\n");
        for (OrderItem item: items) {
            sb.append(item.toString() + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();

    }
}
