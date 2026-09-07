package Exercises.POO;

public class Manager extends Employee {
    // Atributos
    private String department;

    // Constructor
    public Manager(double salary, String name, String department) {
        super(salary, name);
        this.setDepartment(department);
    }

    // Setters
    public void setDepartment(String department) {
        if (department.isBlank()) {
            System.out.println("Ingrese un valor");
        } else {
            this.department = department;
        }
    }

    // Getters
    public String getDepartment() {
        return department;
    }
    // Métodos
}

