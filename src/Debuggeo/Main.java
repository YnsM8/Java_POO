package Debuggeo;

import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("FINAL BOSS DEBUG");

        var scanner = new Scanner(System.in);
        var cart = new ShoppingCart();

        for (int i = 1; i <= 3; i++) {

            System.out.println("\nProducto " + i);

            System.out.print("Nombre: ");
            String name = scanner.nextLine();

            System.out.print("Precio unitario: ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("Cantidad: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            var product = new Product(name, price);

            cart.addProduct(product, quantity);
        }

        var checkout = new CheckoutService();

        double total = checkout.calculateFinalTotal(cart);

        System.out.println("\nTotal final: S/ " + total);

        scanner.close();
    }
}
