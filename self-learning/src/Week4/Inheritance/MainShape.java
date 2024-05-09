package Week4.Inheritance;

// Benefits of Inheritance
// 1. Reusability - Allows to derive new classes from existing classes, so we can resuse fields and methods without write them again
// 2. Polymorphism - Objects of a child class can be passed around and treated as if they were objects of the parent class

public class MainShape {
  public static void main(String[] args) {
    Circle circle = new Circle(5.0);
    System.out.println("Circle Area: " + circle.area());
    circle.display();

    Rectangle rectangle = new Rectangle(4.0, 6.0);
    System.out.println("Rectangle Area: " + rectangle.area());
    rectangle.display();
  }
}
