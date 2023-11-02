package oopsintroduction.cohesion;

// Sequential cohesion: is a weaker form of cohesion and can lead to less maintainable code.

public class BankAccount3 {
    private double balance;
    public BankAccount3(double initialBalance){
        // Constructor
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        // deposit logic
        // Some unrelated operations
    }

    public void withdraw(double amount){
        // withdraw logic
        // more unrelated operations
    }

    public double getBalance(){
        // get balance logic
        // additional unrelated operation
        return 1.9;
    }
}

// There are unrelated operations within each method do not directly relate to managing a bank account, which is a form of sequential cohesion.

