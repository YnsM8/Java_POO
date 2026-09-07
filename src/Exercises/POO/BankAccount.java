package Exercises.POO;

public class BankAccount {
    // Atributos
    private double balance = 0;
    private String id;
    // Constructor
    public BankAccount(String id){
        this.setId(id);
    }

    // Setter
    public void setId(String id){
        if(id.length()==3){
            this.id = id;
        }else{
            System.out.println("Error ingresa un id de 3 caracteres");
        }
    }

    // Getter
    public double getBalance(){
        return balance;
    }
    public String getId(){
        return id;
    }
    // Métodos
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Se depositó " + amount + " soles exitosamente, ahora el balance es de: " + balance);
        }else{
            System.out.println("Ingrese un monto válido");
        }
    }
    public void withdraw(double amount){
        if(amount>0){
            if(amount<=balance){
                balance -= amount;
                System.out.println("Se retiró " + amount + " soles exitosamente, ahora el balance es de: " + balance);
            }else {
                System.out.println("El monto ingresado sobrepasa su saldo");
            }
        }else{
            System.out.println("Ingrese un monto válido");
        }
    }
}
