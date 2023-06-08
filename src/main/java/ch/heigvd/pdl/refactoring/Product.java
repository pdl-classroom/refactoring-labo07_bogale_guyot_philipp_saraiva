package ch.heigvd.pdl.refactoring;

import ch.heigvd.pdl.refactoring.utils.*;

import static ch.heigvd.pdl.refactoring.utils.Color.getColorById;
import static ch.heigvd.pdl.refactoring.utils.Size.getSizeById;

public class Product {

    public static final int SIZE_NOT_APPLICABLE = Size.INVALID_SIZE.getSizeId();

    private final String code;
    private final Color color;
    private final Size size;
    private final double price;
    private final String currency;

    public Product(String code, int color, int size, double price, String currency) {
        this.code = code;
        this.color = getColorById(color);
        this.size  = getSizeById(size);
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public int getColor() {
        return color.getColorId();
    }

    public int getSize() {
        return size.getSizeId();
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}