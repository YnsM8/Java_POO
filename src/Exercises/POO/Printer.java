package Exercises.POO;

public class Printer {
    // Atributos
    // Constructor
    // Setters
    // Getters
    // Métodos
    public void print(String nombre){
        System.out.println("Imprimiendo el nombre: " + nombre);
    }
    public void print(String nombre, int edad){
        System.out.println("Imprimiendo el nombre: " + nombre + " y la edad: " + edad);
    }
    public void print(String nombre, int edad, String DNI){
        System.out.println("Imprimiendo el nombre: " + nombre + " y la edad: " + edad + " y el DNI: " + DNI);
    }
    public void print(String nombre, int edad, double sueldo){
        System.out.println("Imprimiendo el nombre: " + nombre + " y la edad: " + edad + " y el sueldo: " + sueldo);
    }
}
