package designprinciple;

/**
 DRY: Don't repeat yourself
 Kiss: Keep it simple stupid
 Carly's law: Single responsibility
 Boy-scout law: Increase state of code.
 Naming: intention revealing names, descriptive names
 Function name: descriptive, verb
 Word's principle:
 YAGNI: you ain't going to need it, Always implement things which are actually needed not he once you fast foresee, 50-50
 Abstraction
 Class name: Noun
 Good function: Short -> 20 line of code, laptop screen, single task, should have fever argument(3)
 Solid principles

 Command Query Separation (CQS) - is a software design principle that encourages a clear distinction between commands and queries in your code.
 The principle helps improve code readability, maintainability, and overall system design.
 1. Commands:
    Commands are operations that perform some action, change the state of object or the system, and typically do not return a value
    Commands can be implemented as methods or functions that have a side effect on the system.
    For example, a method that updates a database, writes to a file, or modifies an object's internal state can be considered a command.
 2. Queries:
    Queries are operations that retrieve information from an object or the system without causing any side effects or state changes.
    Queries are implemented as method that return a value, such result of a calculation, the state of an object, or data from a database query.
    Query methods should not modify the internal state of the object or the system and should be free from side effects.

 */

//TODO: POJO

public class Main{
    public static void main(String[] args) {

    }

    // command
    public void updateMoney(double amount){
        System.out.println("Code to update an account balance or perform a transaction.");
    }

    // queries
    public double getAccountBalance(){
        System.out.println("Code to retrieve the account balance from a data store.");
        return 500;
    }

}
