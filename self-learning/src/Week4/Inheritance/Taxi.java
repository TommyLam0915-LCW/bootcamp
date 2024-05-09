package Week4.Inheritance;

import java.math.BigDecimal;

public class Taxi extends Vehicle {
  // cannot inherit private fields from superclass
  private BigDecimal minimalCharge;

  public Taxi(String licensePlate, int capacity, BigDecimal minimalCharge) {
    super(licensePlate, capacity); // calling superclass's constructor
    this.minimalCharge = minimalCharge;
  }

  // Inherits all public methods form superclass

  public BigDecimal getMinimalCharge(){
    return this.minimalCharge;
  }
  // additonal methods
  public void setMinimalCharge(BigDecimal minimalCharge) {
    this.minimalCharge = minimalCharge;
  }

  public static void main(String[] args) {
    Taxi taxi = new Taxi("A12345",2,new BigDecimal("4"));
    
    String licensePlate = taxi.getLicensePlate();
    int capacity = taxi.getCapacity();
    BigDecimal minimalCharge = taxi.getMinimalCharge();

    System.out.println("Taxi Capacity: " + capacity);
    System.out.println("Taxi LicensePlate: " + licensePlate);
    System.out.println("Taxi MinimalCharge: " + minimalCharge);

  }
}
