package TechStore;
import java.util.Scanner;

public class Main {
    static void main() {
//        var scanner = new Scanner(System.in);
//        int option;
//        System.out.println("Ingrese una opción (1-N): ");
//        do{
//
//        }while();
        var producto1 = new ElectronicProduct("P01", "Laptop", 1300, 3, 12);
        var producto2 = new ElectronicProduct("P02","Teclado", 300, 10, 6);
        var producto3 = new ElectronicProduct("P03", "Mouse", 150, 5, 6);
        var producto4 = new FoodProduct("P04", "Leche", 5, 30, 2);
        var cliente = new Customer("Juan","72240320", true);

        var tienda = new Store();
        var bodega = new Store();

        bodega.showInventory();

        tienda.addProduct(producto1);
        tienda.addProduct(producto2);
        tienda.addProduct(producto4);
        //tienda.addProduct(null);
        System.out.println("Debajo se deben mostrar los productos");
        tienda.showInventory();

    }
}
