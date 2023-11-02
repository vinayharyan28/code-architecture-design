package oopsintroduction.isa;

/**
 The "diamond problem" is a term used in object-oriented programming to describe a scenario that can occur in languages that support multiple inheritance, where a class inherits from two or more classes that have a common ancestor. Java, however, does not support multiple inheritance in the traditional sense, so the diamond problem is not an issue in Java.
 In the context of multiple inheritance, the diamond problem occurs as follows:
 1. Suppose you have a class hierarchy where Class A is the base class, and both Class B and Class C inherit from Class A. Then, another class, Class D, inherits from both Class B and Class C.
 2. Now, if there is a method or attribute in Class A, and both Class B and Class C override or modify that method, it's unclear which version of the method should be used when Class D calls it, because Class D has inherited from both Class B and Class C, and both have a different implementation of the method.
 3. This ambiguity results in a "diamond" shape in the class hierarchy, and it becomes challenging to determine the correct method or attribute to use, leading to conflicts and potential errors.
 To address this issue, some languages with multiple inheritance (like C++) introduce rules or mechanisms to specify which implementation of a method to use when encountering the diamond problem, such as virtual inheritance.
 In Java, the language designers decided to avoid the diamond problem and keep the language simpler by allowing single inheritance only for classes (a class can inherit from one superclass). However, Java allows multiple interfaces to be implemented by a single class, and it uses a different mechanism to resolve potential conflicts. If a class implements multiple interfaces that define the same method, the class must provide its own implementation of that method, and there is no ambiguity in method resolution. This approach avoids the diamond problem by design.*/

public class Client {
    // Ambiguity multiple and hybrid
    public static void main(String[] args) {
        Scorpio scorpio = new Scorpio();
        scorpio.intro();

    }
}
