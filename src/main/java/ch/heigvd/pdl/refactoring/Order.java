package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Product> products = new ArrayList<>();
    private final int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\": ").append(id).append(", ");
        sb.append("\"products\": [");

        for (int j = 0; j < getProductsCount(); j++) {
            Product product = getProduct(j);
            sb.append(product);
        }

        sb.append("]}");
        return sb.toString();
    }
}
