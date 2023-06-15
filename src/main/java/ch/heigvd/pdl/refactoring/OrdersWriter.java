package ch.heigvd.pdl.refactoring;

/**
 * This class is responsible for writing orders
 */
public class OrdersWriter {

    private final Orders orders;

    /**
     * Constructor
     *
     * @param orders
     */
    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    /**
     * Returns the contents of the orders
     *
     * @return contents of the orders
     */
    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");
        for (int i = 0; i < orders.getOrdersCount(); i++) {
            Order order = orders.getOrder(i);
            sb.append(order);
            sb.append(i == orders.getOrdersCount() - 1 ? "" : ", ");
        }

        return sb.append("]}").toString();
    }
}
