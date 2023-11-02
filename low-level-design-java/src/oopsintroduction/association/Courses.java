package oopsintroduction.association;

import java.util.ArrayList;
import java.util.List;

public class Courses {
    private String courseName;
    private final List<Student> students;

    public Courses(String courseName){
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
}
