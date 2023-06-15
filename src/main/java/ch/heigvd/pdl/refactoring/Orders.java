package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    private final List<Order> ordersList = new ArrayList<Order>();

    public void addOrder(Order order) {
        ordersList.add(order);
    }

    public int getOrdersCount() {
        return ordersList.size();
    }

    public Order getOrder(int i) {
        return ordersList.get(i);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orders=" + ordersList +
                '}';
    }
}
