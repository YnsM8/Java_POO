package TechStore;

import java.util.ArrayList;

public class Store {
    // Atributos
    private final ArrayList<Product> products = new ArrayList<>();
    // Constructor
    // Setters
    // Getters
    // Métodos
    public void addProduct(Product producto){
        if(producto==null){
            throw new IllegalArgumentException("El parámetro ingresado no tiene ningún valor");
        }
        products.add(producto);
    }
    public void showInventory(){
        if(products.isEmpty()){
            System.out.println("No hay productos registrados :(");
        }
        for(Product producto : products){
            System.out.println("======================");
            System.out.println(producto.getId());
            System.out.println("----------------------");
            System.out.println(producto.getName());
            System.out.println(producto.getPrice());
            System.out.println(producto.getStock());
            System.out.println(producto.calculateFinalPrice());
            System.out.println("======================");
        }
    }
}
