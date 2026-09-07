package Exercises.POO;

public class Temperature {
    // Atributos
    private double celsius;
    // Constructores
    public Temperature(double celsius){
        this.setCelsius(celsius);
    }
    // Getters

    public double getCelsius(){
        return celsius;
    }

    // Setters
    public void setCelsius(double celsius){
        if(celsius<=100 && celsius >=-100){
            this.celsius = celsius;
        }else{
            System.out.println("Ingrese una temperatura que este dentro de -100 y 100 grados.");
        }
    }

    // Métodos

}
