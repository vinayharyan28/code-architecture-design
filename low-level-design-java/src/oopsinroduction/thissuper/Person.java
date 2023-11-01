package oopsinroduction.thissuper;

/**
 this:
 this is used to refer to the current instance of the class. It is often used to access instance variables or methods within the current class to avoid ambiguity when there are local and instance variables or method parameters with the same names.
 You can use this to call overloaded constructors within the same class (constructor chaining).
 this can be used to return the current object, which is particularly useful when you want to return the current instance from a method (e.g., for method chaining).
 */
public class Person {
    private final String name;

    Person(String name){
        this.name = name;
    }

    void introduce(){
        System.out.println("My name is " + this.name);
    }

}
