package Exercises.POO;

public class Cow extends Animal{
    // Atributos

    // Constructor
    public Cow(String name){
        super(name);
    }
    // Setters
    // Getters
    // Métodos
    @Override
    public void makeSound(){
        System.out.println("La vaca de MUUUUU!");
    }
}
