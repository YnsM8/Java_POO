package Exercises.POO;

public class Estudiante extends Person{
    // Atributos
    private double grade;
    // Constructor
    public Estudiante(String name, int age, double grade){
        super(name, age);
        this.setGrade(grade);
    }
    // Setters
    public void setGrade(double grade){
        if(grade>=0 && grade<=100){
            this.grade = grade;
        }else{
            System.out.println("Ingrese un valor válido");
        }
    }
    // Getters
    public double getGrade(){
        return grade;
    }
    // Métodos
    public void study(){
        System.out.println("Mi causa " + getName() +" de " + getAge()+ " años está estudiando.");
    }
}
