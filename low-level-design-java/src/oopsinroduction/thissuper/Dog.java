package oopsinroduction.thissuper;
/**
 super:
 super is used to access members (fields or methods) of the superclass (parent class) in the context of a subclass (child class). It is primarily used within a subclass to access or call a super class's members with the same name as members in the subclass.
 You can use super to call the super class's constructor from a subclass's constructor. This is often necessary when the superclass has parameterized constructors that need to be explicitly called from the subclass constructor.
 super can also be used to differentiate between a variable in the current class and a variable with the same name in the superclass.
 */
public class Dog extends Animal{
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("Dog barks");
    }
}
