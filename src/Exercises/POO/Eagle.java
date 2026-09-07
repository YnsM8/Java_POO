package Exercises.POO;

public class Eagle extends Bird{
    // Atributos

    // Constructor
    public Eagle(String name){
        super(name);
    }
    // Setter
    // Getter
    // Métodos
    @Override
    public void fly(){
        super.fly();
        System.out.println("El águila con nombre "+ getName() +" está volando");
    }
}
