package designprinciple.solid;

/**
 * This principle states that a class should have only one reason to change, meaning it should have only one responsibility or job
 * A class should encapsulate a single piece of functionality, and it has multiple responsibility, it should be divide into multiple smaller classes.
 */


// Bad example
class User{
    void saveUser(){
        System.out.println("Code to save user to a database.");
    }

    void generateUserReport(){
        System.out.println("Code to generate a user report");
    }
}

// In the example above, The `USER` class has two responsibilities saving a suer and generating a user report.
// It violates the SRP.
// You can split it into two separate classes one for saving users and another for generating user reports.


public class SingleResponsibilityPrinciples {

}
