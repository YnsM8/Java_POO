package Exercises.POO;

public class Device {
    // Atributos
    private String color;
    // Constructor
    public Device(String color){
        this.setColor(color);
    }
    // Setters
    public void setColor(String color){
        if(color.isBlank()){
            System.out.println("Ingrese un color válido");
        }else{
            this.color = color;
            System.out.println("Device created");
        }
    }
    // Getters
    public String getColor(){
        return color;
    }
    // Métodos
}
