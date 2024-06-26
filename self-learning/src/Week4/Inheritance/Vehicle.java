package Week4.Inheritance;

public class Vehicle {
  private String licensePlate;

  private int capacity;

  public Vehicle(String licensePlate, int capacity) {
    this.licensePlate = licensePlate;
    this.capacity = capacity;
  }

  public int getNumOfPassengers(){
    return capacity -1; //minus driver 
  }

  public int getCapacity(){
    return capacity;
  }

  public String getLicensePlate(){
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate){
    this.licensePlate = licensePlate;
  }
}
