package Exercises.POO;

public class FullTimeEmployee extends EmployeeUltimo{
    // Atributos
    private double baseSalary;
    private double bonus;
    // Constructor
    public FullTimeEmployee(double baseSalary, double bonus){
        this.setBaseSalary(baseSalary);
        this.setBonus(bonus);
    }
    // Setters
    public void setBaseSalary(double baseSalary){
        if(baseSalary>=1130){
            this.baseSalary = baseSalary;
        }else{
            System.out.println("Ingrese un suledo mayor o igual al mínimo en Perú.");
        }
    }
    public void setBonus(double bonus){
        if(bonus>=0){
            this.bonus = bonus;
        }else{
            System.out.println("Ingrese un valor válido mayor o igual a 0");
        }
    }
    // Getters
    public double getBaseSalary(){
        return baseSalary;
    }
    public double getBonus(){
        return bonus;
    }
    // Métodos
    @Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }
}
