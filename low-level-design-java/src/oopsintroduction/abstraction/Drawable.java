package oopsintroduction.abstraction;
/**
 Abstraction is one of the fundamental concepts in object-oriented programming (OOP) that allows you to model
 complex systems by simplifying the representation of objects and their interactions.
 In Java, abstraction is achieved through classes, interfaces, and abstract methods.
 It is the process of hiding the complex reality while exposing only the necessary parts to the user.

 Abstract Classes and Methods:
 Abstract Class: An abstract class in Java is a class that cannot be instantiated on its own, and it may have abstract methods.
 Abstract classes are used as a blueprint for other classes and can contain a mix of concrete (non-abstract) and abstract methods.
 You declare an abstract class using the abstract keyword.

 Abstract Method: An abstract method is a method declared without an implementation in an abstract class.
 Abstract methods have no method body and end with a semicolon, like this: abstract void myMethod();.
 Subclasses that inherit from an abstract class must provide concrete implementations for these abstract methods.

 In this example, we have an abstract class Shape, a concrete class Circle that extends Shape, an interface Drawable,
 and a concrete class Rectangle that implements Drawable.
 Each class or interface represents a level of abstraction,
 defining the behavior that specific objects should exhibit.

 Show essential details
 Hide Non-essential details

 ex: Driving car
 */

public interface Drawable {
    void draw();
}
