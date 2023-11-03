package designprinciple.solid;

/**
 * This principle state that software entities (such as classes, modules, and functions) should be open for extension but closed for modification.
 * It encourages you to design you to design your code in a way that you can add new feature or behavior without changing existing code.
 * This is often achieved though inheritance, interface, and abstraction.
 * */

interface Shape{
    double area();
}

class Circle implements Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}


class Rectangle implements Shape{
    double width, height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// In the example, the Shape interface is open for extension, and you can create new shape classes (e.g Triangle) without modifying the existing code.

public class OpenClosedPrinciple {

}
