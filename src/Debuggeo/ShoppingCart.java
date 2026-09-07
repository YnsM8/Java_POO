package Debuggeo;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
    }

    public double calculateSubtotal() {

        double subtotal = 0;

        for (CartItem item : items) {
            subtotal += item.calculateSubtotal();
        }

        return subtotal;
    }
}
