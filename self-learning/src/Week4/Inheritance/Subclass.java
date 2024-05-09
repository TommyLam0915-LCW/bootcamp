package Week4.Inheritance;

public class Subclass extends Superclass {
  private int someOtherValue;

  // No-args constructor in the subclass
  public Subclass() {
    // Does not specify superclass's no-args constructor here
    // But Superclass(0 constructor will still be invoked implicity
    System.out.println("[Subclass] No-args constructor called");
  }

  // Constructor with args in the subclass
  public Subclass(int someValue, int someOtherValue) {
    super(someValue); // Superclass's constructor with args will be called
    this.someOtherValue = someOtherValue;
    System.out.println("[Subclass] Constructor with args called ");
  }
  public static void main(String[] args) {
    Subclass s1 = new Subclass();
    Subclass s2 = new Subclass(99,100);
  }
}
