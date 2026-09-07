package Exercises.POO;

public class Carro extends Vehicle implements Movable{
    // Atributos
    String color;
    // Constructores
    public Carro(double speed, String color){
        super(speed);
        this.color = color;
    }

    // Setters

    // Getters

    // Métodos
    public void honk(){
        System.out.println("Bocinazooo!!!");
    }

    @Override
    public void describe(){
        System.out.println("Este vehículo es llamado Car o Carro en español y tiene un peso ligero además de 4 neumáticos.");
    }
    public void start(){
        System.out.println("Este carro arrancó. :)");
    }
    public void mover(){
        System.out.println("El carro se esta moviendo gracias a sus 4 neumáticos.");
    }
}
