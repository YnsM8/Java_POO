package Exercises.POO;

public class TemperatureChecker {
    // Atributos
    // Constructor
    // Setters
    // Getters
    // Métodos
    public void checkTemperature(double temperature) throws InvalidTemperatureException{
        if(temperature < -50 || temperature > 50){
            throw new InvalidTemperatureException("La temperatura es debe estar dentro de -50 y 50 grados");
        }
        System.out.println("La temperatura ingresada es válida");
    }
}
