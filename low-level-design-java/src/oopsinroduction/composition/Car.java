package oopsinroduction.composition;
// Composition is a more specific form of association in object-oriented programming that represents a "whole-part" relationship between objects. In composition, one class (the whole) contains or is composed of another class (the part), and the part cannot exist independently without the whole. In other words, when the whole is destroyed, the part is also destroyed.
public class Car {
    private String make, model;
    private Engine engine;
    public Car(String make, String model, Engine engine){
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    // Other methods and properties for the Car class


}
