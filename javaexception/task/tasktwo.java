package javaexception.task;



abstract class Shape {
    abstract double area(); // Abstract method

    void displayShapeType(String type) { // Non-abstract method
        System.out.println("Shape: " + type);
    }
}

class Circle extends Shape {
    double radius = 3;

    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 4;
    double width = 5;

    double area() {
        return length * width;
    }
}
public class tasktwo {

	public static void main(String[] args) {
		Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.displayShapeType("Circle");
        System.out.println("Area: " + c.area());

        r.displayShapeType("Rectangle");
        System.out.println("Area: " + r.area());

	}

}
