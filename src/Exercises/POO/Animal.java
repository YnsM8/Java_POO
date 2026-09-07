package Exercises.POO;

public class Animal {
    // Atributos
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }
    // Setters
    // Getters
    // Métodos
    public void eat() {
        System.out.println("El animal con nombre " + name + " está comiendo.");
    }
    public void makeSound(){
        System.out.println("Este animalito esta haciendo un sonido");
    }
    public void getType(){
        System.out.println("Esta función muestra el tipo de animal que es. :v");
    }
}
