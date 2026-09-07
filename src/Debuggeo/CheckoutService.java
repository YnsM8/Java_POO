package Debuggeo;

public class CheckoutService {

    public double calculateFinalTotal(ShoppingCart cart) {

        double subtotal = cart.calculateSubtotal();

        double discount = 0;

        if (subtotal >= 300) {
            discount = subtotal * 0.10;
        }

        double discountedSubtotal = subtotal - discount;

        double shipping = 20;

        if (discountedSubtotal >= 500) {
            shipping = 0;
        }

        return discountedSubtotal + shipping;
    }
}
