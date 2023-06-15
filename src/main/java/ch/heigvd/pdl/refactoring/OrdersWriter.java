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
            sb.append(", ");
      }


      if (orders.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
      }
      return sb.append("]}").toString();
   }
}
