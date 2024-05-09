package Week4.DataType4.Abstraction;

public class MycClass implements MyInterface {
  public static void main(String[] args) {
    // MyClass.staticMethod(); // This is invalid
    MyInterface.staticMethod(); // Correct way to call the static method

    } 
  }
