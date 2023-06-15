package ch.heigvd.pdl.refactoring;

public class OrdersWriter {

    private final Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

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
