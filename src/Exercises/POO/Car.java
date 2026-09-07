package Exercises.POO;

public class Car {
    // Atributos
    private int speed;
    // Constructor
    public Car(int speed){
        this.setSpeed(speed);
    }
    // Setters
    public void setSpeed(int speed){
        if(speed>0){
            this.speed = speed;
        }else{
            System.out.println("Ingrese un valor/velocidad mayor a 0");
        }
    }
    // Getters
    public int getSpeed(){
        return speed;
    }
    // Métodos
    public void accelerate(int amount){
        if(amount>0 && amount<=120){
            speed += amount;
        }else{
            System.out.println("Ingrese un valor válido (como máximo 120).");
        }
    }
    public void brake(int amount){
        if(speed>amount && amount>0){
            speed -= amount;
        }else{
            System.out.println("Ingrese un valor no mayor o igual a la velocidad actual y mayor a 0.");
        }
    }
}
