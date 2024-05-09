package Week4.DataType4.Polymorphism.StaticPolymorphism;

public class ClassWithConstructors {
  private int x;
  private int y;

  public ClassWithConstructors() {
    this(100, 100); // Call anither constructor
    // this.x = 100;
    // this.y = 100;
  }

  public ClassWithConstructors(int x) {
    this(x, 100);
  }

  public ClassWithConstructors(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
