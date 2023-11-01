package oopsinroduction.association;

import java.util.ArrayList;
import java.util.List;

/**
 In Object-oriented programming, association represents a relationship between two or more classes or objects,
 where they are connected in some way. Associations can used to model how objects, where objects interact and collaborate
 with each other within a software system. Associations can be categorized into various types, such as one-to-one
 one-to-many many-to-many, depending on the cardinality of the relationship between the classes or objects.
 Suppose we have two classes, Student and Course, and we want to represent the relationship between students and
 the courses they are enrolled in. This is a classic example of association.


 */
public class Student {
    private String studentName;
    private final List<Courses> courses;
    public Student(String studentName){
        this.courses = new ArrayList<>();
    }

    public void enrollInCourses(Courses courses){
        this.courses.add(courses);
        courses.addStudent(this);
    }
}
