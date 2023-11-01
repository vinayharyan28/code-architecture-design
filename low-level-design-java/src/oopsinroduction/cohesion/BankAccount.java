package oopsinroduction.cohesion;

// Functional Cohesion
public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
        }else {
            System.out.println("Handle insufficient funds");
        }
    }

    public double getBalance(){
        return balance;
    }
}

// In this example, all the methods and fields in the 'BankAccount' class are directly related to managing a bank account, which represents high functional cohesion.

