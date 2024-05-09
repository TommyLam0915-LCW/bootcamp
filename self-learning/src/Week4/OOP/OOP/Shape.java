public abstract class Shape {

  // OOP (Inheritance and Polymorphism)
  public abstract double calculateArea();

  public static double area(Shape[] shapes) {
    double totalArea = 0.0;
    for (Shape shape : shapes) {
      totalArea += shape.calculateArea();
    }
    return totalArea;
  }
}
