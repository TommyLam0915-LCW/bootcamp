package Week3.InstanceMethod.PassByValue;

public class PrimitiveType {
  public static void doSomething(int x) {
    // x = 10
    x = 99; // this value assignment only apply to parameter x in this method
    // x = 99
    System.out.println(x); // print 99
  }

  public static void main(String[] args) {
    int x = 10; // int x; x =10;
    doSomething(x); //pass value 10 to the method
    System.out.println("x is "  + x); // print 10
  } // Output: x is 10
}
