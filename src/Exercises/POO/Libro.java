package Exercises.POO;

public class Libro extends Product {
    // Atributos
    // Constructor
    public Libro(double price){
        super(price);
    }
    // Setters
    // Getters
    // Métodos
    @Override
    public double getPrice(){
        return super.getPrice() - (super.getPrice()*0.1);
    }
}
