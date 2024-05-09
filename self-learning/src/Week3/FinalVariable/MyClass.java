package Week3.FinalVariable;

public class MyClass {
  private final int MAX_VALUE = 10;
  static final double PI = 3.141592653589793;
  static final int MAXIMUM_NUMBER_OF_ORDERS_PER_DAY = 1000;

  public static void main(String[] args){
    MyClass obj = new MyClass();
    System.out.println(obj.MAX_VALUE);

    // Compilation error: Cannot assign a new value to a final variable 
    // obj.MAX_VALUE = 20;
  }
}
