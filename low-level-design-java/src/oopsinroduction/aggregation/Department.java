package oopsinroduction.aggregation;

// Aggregation is another form of association in object-oriented programming that represents a relationship between objects where one class (the whole) contains or is associated with another class (the part), but the part can exist independently of the whole. In aggregation, the part is not owned by the whole, and it can be shared among multiple wholes.
// Suppose we have two classes, University and Department, and we want to model the relationship where a university contains multiple departments. This is a classic example of aggregation.
public class Department {
    private String name;
    public Department(String name){
        this.name = name;
    }

    // Other methods and properties for the department class
}


