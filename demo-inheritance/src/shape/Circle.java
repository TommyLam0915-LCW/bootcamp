package shape;

import java.math.BigDecimal;

public class Circle extends Shape {

  private double radius;

  public double area() {
    // return this.radius*this.radius* Math.PI; //BigDecimal
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius))//
        .multiply(BigDecimal.valueOf(Math.PI))//
        .doubleValue();
  }
}
