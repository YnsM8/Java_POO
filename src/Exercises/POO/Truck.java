package Exercises.POO;

public class Truck extends Vehicle{
    // Atributos
    // Constructor
    public Truck(double speed){
        super(speed);
    }
    // Setters
    // Getters
    // Métodos
    @Override
    public void describe(){
        System.out.println("Este es un vehículo pesado llamado camión o truck en inglés, al igual que el carro lleva 4 neumáticos o incluso más.");
    }
    public void start(){
        System.out.println("Este camión arrancó. :)");
    }
}
