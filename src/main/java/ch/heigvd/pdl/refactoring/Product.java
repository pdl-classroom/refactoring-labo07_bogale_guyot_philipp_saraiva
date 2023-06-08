package ch.heigvd.pdl.refactoring;

public class Product {

    public static final int SIZE_NOT_APPLICABLE = -1;

    private final String code;
    private final int color;
    private final int size;
    private final double price;
    private final String currency;

    public Product(String code, int color, int size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public int getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
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