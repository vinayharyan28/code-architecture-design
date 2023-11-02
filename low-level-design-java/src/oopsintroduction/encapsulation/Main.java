package oopsintroduction.encapsulation;


public class Main {
    public static void main(String[] args) {
        Student vinay = new Student(25, 8.7, "Vinay");
        System.out.println("Student name: " + vinay.getName());
        System.out.println("Student age: " + vinay.getAge());
        System.out.println("Student GPA: " + vinay.getGpa());

        vinay.setGpa(9.7);
        System.out.println("Updated GPA: " + vinay.getGpa());
    }
}
