package Exercises.POO;

public class Horse extends Animal{
    // Atributos
    // Constructor
    public Horse(String name){
        super(name);
    }
    // Setters
    // Getters
    // Métodos
    @Override
    public void getType(){
        System.out.println("Este es un animal de tipo équido. :-)");
    }
}
