package methods;

public class Staff {
  private String name;

  private double salary;
  // Constructor
  public Staff(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }
  public Staff(String name) {
    this.name = name;
   // this.salary = salary;
  }


  // Static Method
  private static Staff of(String name) {
    return new Staff(name);

  }
  public double getSalary(){
    return this.salary;
  }

  public static Staff peter(){
    return new Staff("Peter");
  }
}

