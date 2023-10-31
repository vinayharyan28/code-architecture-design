package oopsinroduction;

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