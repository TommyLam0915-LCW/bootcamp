package Week4.DataType4.Polymorphism.DynamicPolymorphism.Casting.Downcasting;

public class MyClass {
  static void method(float x) {
    System.out.println("hello");
  }

  // static void method (int x){
  // System.out.println("hello");
  // }

  public static void main(String[] args) {
    method(2); // cast 2 to float (2 is int)
  }
}

/*
Output:
float
 */
