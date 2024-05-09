package Week4.DataType4.Encapsulation.EncapsulatesClassState;

// Example 3: Encapsulation with Read-Only Fields
public class Circle {
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}
