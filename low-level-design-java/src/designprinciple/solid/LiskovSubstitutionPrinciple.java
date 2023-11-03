package designprinciple.solid;

/**
 * This principle state that objects of a derived class should be able to replace objects of the class without affecting the correctness of the program.
 * In other words, if a class is a subclass of another class, it should be able to be used interchangeably with its parent class.
 * */

// Bad example
class Bird{
    void fly(){
        System.out.println("Code for flying.");
    }
}

class Ostrich extends Bird{
    @Override
    void fly(){
        throw new UnsupportedOperationException("Ostrich can't fly.");
    }
}

// In this example, 'Ostrich' is subclass 'Bird', but it overrides the 'fly' method to throw and exception, which adheres to LSP because it preserves the behavior contract of the base class

public class LiskovSubstitutionPrinciple {

}
