package Week3.StaticVariables;

public class ClassA {
  // 1
  public static final int SOME_NUMBER = initSomeNum();
  public static int someOtherNumber = 99;

  // 2
  public final String someString = initSomeString();

  // 1.2
  static {
    System.out.println("[Class A] Calling static initialization block");
    someOtherNumber = 100;
  }

  // 2.2
  {
    System.out.println("[Class A] Calling private static method");
  }

  // 1.1
  private static int initSomeNum() {
    System.out.println("[Class] Calling private static method");
    return 0;
  }

  // 2.1
  private String initSomeString(){
    System.out.println("[Class A] Calling private method");
    return "SomeStringA";
  }
  // 3 
  public ClassA(){
    System.out.println("[Class A] Calling constructor");
  }
}
