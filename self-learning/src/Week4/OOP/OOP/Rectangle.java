package Week4.OOP.OOP;



public class Rectangle extends Shape{
  private double length;
  private double width;

  public Rectangle(double length, double width){
    this.width = width;
    this.length = length;
  }

  @Override
  public double calculateArea(){
    return length *width;
  }
}
