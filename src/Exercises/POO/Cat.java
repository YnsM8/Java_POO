package Exercises.POO;

public class Cat extends Animal{
    // Atributos
    // Constructor
    public Cat(String name){
        super(name);
    }
    // Setters
    // Getters
    // Métodos

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
    public void getType(){
        System.out.println("Este animal es de tipo Felino");
    }
}
