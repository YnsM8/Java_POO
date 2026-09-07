package Exercises.POO;

public class Electronic extends Product {
    // Atributos
    // Constructor
    public Electronic(double price){
        super(price);
    }
    // Setters
    // Getters
    // Métodos
    @Override
    public double getPrice(){
        if(super.getPrice()>=1000){
            return super.getPrice() - (super.getPrice()*0.15);
        }else{
            return super.getPrice() - (super.getPrice()*0.05);
        }
    }
}
