package Exercises.POO;

public class SavingsAccount extends BankAccount {
    // Atributos

    // Constructor
    public SavingsAccount(String id) {
        super(id);
    }
    // Setter
    // Getter
    // Métodos
    public void addInterest(double interest) {
        if(interest>=0 && interest<=100){
            double interestAmount = (interest/100) * getBalance();
            deposit(interestAmount);
            System.out.println("Interés depositado exitosamente :)");
        }else{
            System.out.println("Error ingresa un interés válido (0%-100%).");
        }
    }
}
