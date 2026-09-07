package Exercises.POO;

public class Dog extends Animal{
    // Atributos
    // Constructor
    public Dog(String name){
        super(name);
    }
    // Setters
    // Getters
    // Métodos
    @Override
    public void makeSound(){
        System.out.println("Woof!!");
    }
    public void getType(){
        System.out.println("Este animal es de tipo Canino");
    }
}
