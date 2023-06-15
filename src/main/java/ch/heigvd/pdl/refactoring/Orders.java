package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for representing a list of orders.
 */
public class Orders {

    private final List<Order> ordersList = new ArrayList<>();

    /**
     * Adds an order to the list.
     *
     * @param order the order to add
     */
    public void addOrder(Order order) {
        ordersList.add(order);
    }

    /**
     * Returns the number of orders in the list.
     *
     * @return number of orders
     */
    public int getOrdersCount() {
        return ordersList.size();
    }

    /**
     * Returns the order at the specified position in the list.
     *
     * @param i the position of the order to return
     * @return order at position i
     */
    public Order getOrder(int i) {
        return ordersList.get(i);
    }

    /**
     * Returns the list of orders.
     *
     * @return ordersList
     */
    @Override
    public String toString() {
        return "Orders{" +
                "orders=" + ordersList +
                '}';
    }
}
