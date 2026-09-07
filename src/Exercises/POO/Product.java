package Exercises.POO;

public class Product {
    // Atributos
    private double price;
    // Constructor
    public Product(double price){
        this.setPrice(price);
    }
    // Métodos
    // Getter
    public double getPrice(){
        return price;
    }
    // Setter
    public void setPrice(double price){
        if(price>0){
            this.price += price;
        }else{
            System.out.println("Ingresa un monto válido mayor a 0.");
        }
    }
}
