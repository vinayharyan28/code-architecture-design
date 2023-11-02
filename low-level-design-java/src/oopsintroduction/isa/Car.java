package oopsintroduction.isa;

public class Car {
    String color;
    int weight;

    void run(){
        System.out.println("Car is running.");
    }

    void run(int speed){ // Compile time polymorphism - Method overloading
        System.out.println("Running on " + speed + "km/h");
    }

    void pressBreak(){
        System.out.println("Break is pressed.");
    }
}
