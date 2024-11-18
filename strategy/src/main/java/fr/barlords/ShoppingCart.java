package fr.barlords;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;
    private double taxRate;

    public ShoppingCart(double taxRate) {
        this.products = new ArrayList<>();
        this.taxRate = taxRate;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void applyDiscountToAll(double discountPercentage) {
        for (Product product : products) {
            product.applyDiscount(discountPercentage);
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total + (total * taxRate / 100);
    }

    public double calculateTotalWithCurrency(String currency) {
        double total = calculateTotal();
        switch (currency) {
            case "USD":
                return total * 1.1;
            case "EUR":
                return total * 0.9;
            case "GBP":
                return total * 0.8;
            default:
                return total;
        }
    }
}
