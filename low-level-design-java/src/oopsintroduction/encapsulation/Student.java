package oopsintroduction.encapsulation;

/**
 Encapsulation is one of the fundamental concepts in Object-oriented programming (OOP) that involves bundling the data
 (attributes or fields) and the methods (function or procedure) that operate on that data into single unit, known as a class.
 It also includes restricting direct access to the internal state of an object and providing controlled access through methods.
 Encapsulation helps in data hiding and provides a way to maintain the integrity and consistency of an object's state
 In this example, the Student class encapsulates the data (name, age, and GPA) by declaring them as private fields.
 It provides public getter and setter methods to access and modify the state of the Student object.
 This encapsulation ensures that the internal state is controlled and can be accessed and modified only through well-defined methods,
 allowing you to enforce constraints and maintain the integrity of the object's data.
 Read only - getter
 Write only - setter
 */


public class Student {
    private int age;
    private double gpa;
    private String name;


    public Student(int age, double gpa, String name) {
        this.age = age;
        this.gpa = gpa;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 || gpa <= 10.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
