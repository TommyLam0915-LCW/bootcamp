package src.Shape;

public class Square implements Shape {

  private double length;

  Square(double length) {
    this.length = length;
  }

  @Override
  public double area(){
    return this.length*length;
  }

  public double getLength() {
    return this.length;
  }

  public void setLength(double length) {
    this.length = length;
  }
}
