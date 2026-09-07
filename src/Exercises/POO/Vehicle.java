package Exercises.POO;

public class Vehicle {
    // Atributos
    private double speed;
    // Constructores
    public Vehicle(double speed){
        this.speed = speed;
    }
    // Setters

    // Getters
    public double getSpeed() {
        return speed;
    }
    // Métodos
    public void move(){
        System.out.println("El vehículo se mueve pe.");
    }
    public void describe(){
        System.out.println("Esta es un descripción del vehículo");
    }
    public void start(){
        System.out.println("El vehículo arrancó. :)");
    }
}
