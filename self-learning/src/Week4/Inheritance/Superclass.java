package Week4.Inheritance;

public class Superclass {
  
  private int someValue;

  // No-args constructor in the superclass
  public Superclass() {
    System.out.println("[Superclass] No-args constructor called");
  }

  // Constructor with args in the superclass
  public Superclass (int someValue){
    this.someValue = someValue;
    System.out.println("[Superclass] Constructor with args called");
  }
}
