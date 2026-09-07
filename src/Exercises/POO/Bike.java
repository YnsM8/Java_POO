package Exercises.POO;

public class Bike extends Vehicle{
    // Atributos
    // Constructor
    public Bike(double speed){
        super(speed);
    }
    // Setters
    // Getters
    // Métodos
    @Override
    public void describe(){
        System.out.println("Este vehículo se llama Bicicleta o Bike en inglés, a diferencia de los otros dos tipos, este tiene dos llantas y no usa ningún tipo de combustible.");
    }
    public void start(){
        System.out.println("Esta bicicleta se empezó a mover. :)");
    }
}
