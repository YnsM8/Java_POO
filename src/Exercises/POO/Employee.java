package Exercises.POO;

public class Employee {
    // Atributos
    private double salary;
    private String name;
    // Constructor
    public Employee(double salary, String name){

        this.setSalary(salary);
        this.setName(name);
    }
    // Setters
    public void setSalary(double salary){
        if(salary>=1130){
            this.salary = salary;
        }else{
            System.out.println("Ingrese un monto válido, de por lo menos el sueldo mínimo (1130 soles).");
        }
    }
    public void setName(String name){
        if(name.isBlank()){
            System.out.println("Ingrese algún nombre");
        }else{
            this.name = name;
        }
    }
    // Getters
    public double getSalary(){
        return salary;
    }
    public String getName(){ return name; }
    // Métodos
    public void raiseSalary(double percent){
        if((percent/100)>0){
            salary += ((percent/100)*salary);
            System.out.println(String.format("Aumento del %.0f exitoso!!!", percent));
        }else{
            System.out.println("Ingrese un porcentaje válido mayor a 0.");
        }
    }
}
