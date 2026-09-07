package Exercises.POO;

public class Student {
    // Atributos
    private int grade;
    // Constructor
    public Student(int grade){
        this.setGrade(grade);
    }
    // Setters
    public void setGrade(int grade){
        if(grade>=0 && grade<=100){
            this.grade = grade;
        }else{
            System.out.println("Ingresa una nota válida (0-100)");
        }
    }
    // Getters
    public int getGrade(){
        return grade;
    }
    // Métodos
    public boolean isPassed(){
        if(grade>=60){
            System.out.println(String.format("El estudiante tiene una nota aprobatoria, %d", grade));
            return true;
        }else{
            System.out.println(String.format("El estudiante tiene una nota desaprobatoria, %d", grade));
            return false;
        }
    }
}
