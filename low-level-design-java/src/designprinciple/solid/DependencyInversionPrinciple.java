package designprinciple.solid;

/**
 * This principle suggests that high-level modules (e.g. business logic) should not depend on low-level modules (e.g data access or concrete implementations). instead, both should depend on abstraction.
 * Abstraction, should not depend on details; details should depend on abstractions.
 **/

// Without DIP
class LightBulb{
    boolean turnOn(){
        System.out.println("Code to turn on the light");
        return true;
    }

    void turnOff(){
        System.out.println("Code to turn off the light");
    }
}

class Switch{
    LightBulb bulb = new LightBulb();
    void operate(){
        if (bulb.turnOn()){
            bulb.turnOff();
        }
    }
}

// In the above code, the `Switch` class directly depends on the concrete `LightBulb` class.
// With DIP, you'd use abstractions and dependency injection to decouple them.

public class DependencyInversionPrinciple {
}
