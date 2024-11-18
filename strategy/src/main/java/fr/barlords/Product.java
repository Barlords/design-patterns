package fr.barlords;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double discountPercentage) {
        price = price - (price * discountPercentage / 100);
    }
}
