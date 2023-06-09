package ch.heigvd.pdl.refactoring;

import ch.heigvd.pdl.refactoring.utils.*;

public class Product {

    public static final Size SIZE_NOT_APPLICABLE = Size.INVALID_SIZE;

    private final String code;
    private final Color color;
    private final Size size;
    private final double price;
    private final String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public Size getSize() {
        return size;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"code\": \"").append(code).append("\", ");
        sb.append("\"color\": \"").append(color).append("\", ");

        if (getSize() != Product.SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"").append(size).append("\", ");
        }

        sb.append("\"price\": ").append(price).append(", ");
        sb.append("\"currency\": \"").append(currency).append("\"}");
        return sb.toString();
    }
}