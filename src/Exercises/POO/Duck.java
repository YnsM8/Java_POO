package Exercises.POO;

public class Duck implements Swimmable,Flyable{
    // Atributos
    // Constructores
    // Setters
    // Getters
    // Métodos
    @Override
    public void swim(){
        System.out.println("Ahora el pato puede nadar");
    }
    public void fly(){
        System.out.println("Ahora el pato puede volar");
    }
}
