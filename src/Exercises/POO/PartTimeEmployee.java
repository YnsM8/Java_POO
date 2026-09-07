package Exercises.POO;

public class PartTimeEmployee extends EmployeeUltimo{
    // Atributos
    private int workHours;
    private double payHour;
    // Constructor
    public PartTimeEmployee(int workHours, double payHour){
        this.setWorkHours(workHours);
        this.setPayHour(payHour);
    }
    // Setters
    public void setWorkHours(int workHours){
        if(workHours>0){
            this.workHours = workHours;
        }else{
            System.out.println("Ingrese cantidad de horas válidas.");
        }
    }
    public void setPayHour(double payHour){
        if(payHour>0){
            this.payHour = payHour;
        }else{
            System.out.println("Ingrese un valor válido generoso, no sea rata!!!");
        }
    }
    // Getters
    public int getWorkHours(){
        return workHours;
    }
    public double getPayHour(){
        return payHour;
    }
    // Métodos
    @Override
    public double calculateSalary(){
        return workHours * payHour;
    }
}
