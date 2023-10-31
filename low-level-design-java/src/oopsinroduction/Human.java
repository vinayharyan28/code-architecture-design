package oopsinroduction;

//TODO: Memory management in java
//TODO: Clone
//TODO: Constructor return any value
//TODO: Why main method is static
//TODO: this and super
//TODO: Diamond problem
//TODO: Python support hybrid and Multiple
//TODO: Cohesion
//TODO: Coupling
//TODO: Association
//TODO: Aggregation
//TODO: Composition

public class Human {

    // Properties
    int age;
    int weight;
    String name;
    static int count=0; // Not belong to object, It belongs from class // Save space // Access without object
    // 1. one for all object.
    // 2. Required class property.
    // 3. Required less space.

    // 2 types of constructor
    // No-arguments constructor
    // Parameterized constructor

    // Rule
    // No return type
    // Name same as class name
    // No use abstract/static/final

    public Human(){
        count++;
        this.weight = 50;
    }

    public Human(int age, int weight, String name){
        this("vinay");
        count++;
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public Human(String name){ // Constructor overloading
        count++;
        this.name = name;
    }

    // Behavior
    void eat(){
        System.out.println("Eating...");
    }

    void sleep(){
        System.out.println("Sleeping...");
    }

    static void update(){
        count++; // One static function change only static properties // not use this and super
    }
}
