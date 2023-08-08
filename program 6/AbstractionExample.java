import java.util.*;

abstract class Shape {
    int l, b, r;
    Scanner sc = new Scanner(System.in);

    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        System.out.println("Enter length of rectangle");
        l = sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        b = sc.nextInt();
        System.out.println("Area of rectangle: " + l * b);
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.println("Enter base of triangle");
        b = sc.nextInt();
        System.out.println("Enter height of triangle");
        l = sc.nextInt();
        System.out.println("Area of Triangle: " + l * b * 0.5);
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.println("Enter radius of circle");
        r = sc.nextInt();
        System.out.println("Area of circle is: " + 3.1416 * r * r);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        Circle cir = new Circle();

        rect.printArea();
        tri.printArea();
        cir.printArea();
    }
}
