package oopsintroduction.cohesion;

// Low cohesion: Where the class contains methods and fields with unrelated purposes:

public class BankAccount2 {
    private double balance;
    public BankAccount2(double initialBalance){
        // Constructor logic
    }

    public void deposit(double amount){
        // Deposit logic
    }

    public String getAccountInfo(){
        // Generate account information as a string
        return "";
    }

    public void transferToAnotherAccount(double amount, BankAccount2 recipient){
        // Unrelated operation to transfer money to another account
    }
}


// In This case, the 'transferToAnotherAccount' method is not directly related to managing the bank account,
// and the 'getAccountInfo method doesn't belong to the core functionality of managing a bank account.
// This demonstrates low cohesion within the class


