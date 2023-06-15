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
        this.size  = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}