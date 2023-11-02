package oopsintroduction;
/**
 The main method is public to make it accessible for execution from outside the class, static to allow it to be called without creating an instance of the class, void because it doesn't return a value, and it accepts an array of strings (args) to pass command-line arguments to the program. These modifiers and the method signature are essential for the JVM to locate and execute the main method when you run a Java application.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Human vinay = new Human();
        vinay.age = 25;
        vinay.weight = 65;
        vinay.sleep();
        vinay.eat();

        System.out.println();
        Human testHuman = new Human(25, 65, "Vinay");
        System.out.println(testHuman.age + " " + testHuman.name + " " + testHuman.weight);
        testHuman.eat();
        testHuman.sleep();

        System.out.println();
        System.out.println("Number of object count: " + Human.count);

    }
}