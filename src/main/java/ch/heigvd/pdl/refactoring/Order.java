package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for representing an order. It has a unique id and a list of products.
 */
public class Order {
    private final List<Product> products = new ArrayList<>();
    private final int id;

    /**
     * Constructor
     *
     * @param id the id of the order
     */
    public Order(int id) {
        this.id = id;
    }

    /**
     * Returns the number of products in the order.
     *
     * @return number of products
     */
    public int getProductsCount() {
        return products.size();
    }

    /**
     * Returns the product at the specified position in the order.
     *
     * @param j the position of the product to return
     * @return product at position j
     */
    public Product getProduct(int j) {
        return products.get(j);
    }

    /**
     * Adds a product to the order.
     *
     * @param product the product to add
     */
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
