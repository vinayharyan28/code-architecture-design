package oopsinroduction.aggregation;

import java.util.ArrayList;
import java.util.List;


/**
 In this example:
 The Department class represents a department within a university and has its own properties and methods.
 The University class represents a university and contains a list of Department objects. This aggregation relationship is represented by the departments field in the University class.
 Multiple departments can be added to a university using the addDepartment method, and a department can be associated with multiple universities.
 Here are some key characteristics of aggregation:
 No Ownership: In aggregation, the whole (the University) does not own the part (the Department). The Department can exist independently of the University and may be shared among multiple universities.
 Lifecycle Independence: The part (the Department) can have a lifecycle independent of the whole. If a University is disposed of, the associated Departments can continue to exist and be associated with other Universities.
 Looser Relationship: Aggregation represents a looser relationship between the whole and its parts compared to composition. The parts are not created or destroyed by the whole and can exist independently.
 Aggregation is useful for modeling relationships where objects can be shared among multiple containers or where the lifecycle of the part can be independent of the whole. It is typically used to represent "has-a" relationships that are not as strong or tightly coupled as "contains" relationships represented by composition.*/

public class University {
    private String name;
    private List<Department> departments; // Aggregation: University has multiple Departments
    public University(String name){
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department){
        departments.add(department);
    }

    // Other methods and properties for the University class
}


