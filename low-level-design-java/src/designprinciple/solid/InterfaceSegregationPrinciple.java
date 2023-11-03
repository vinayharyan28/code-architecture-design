package designprinciple.solid;

/**
 * This principle states that a class should not be forced to implement interfaces it does not use.
 * It suggests breaking large, monolithic interface into smaller, more specific ones, so that classes can implement only what's relevant to them.
 * */

interface Worker{
    void work();
    void eat();
}

class Engineer implements Worker{
    @Override
    public void work(){
        System.out.println("Code for engineer work.");
    }

    @Override
    public void eat(){
        System.out.println("Code for eating.");
    }
}

// In this example, The Worker interface violates ISP because not all classes that implement it need both work and eat methods.
// It's better to create separate interface for these two functions.


public class InterfaceSegregationPrinciple {
}
