package Week2.StaticMethod;

public class MathOperation {
  public static int add(int a, int b) {
    return a + b;
  }

  public static int substract(int a, int b) {
    return a - b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static int divide(int a, int b) {
    return a / b;
  }

  public static void main(String[] args) {
    int result = add(6, 3); // 9
    int result01 = substract(6, 3); // 3
    int result02 = multiply(6, 3); // 18
    int result03 = divide(6, 3); // 2
    System.out.println("Result: " + result);
    System.out.println("Result: " + result01);
    System.out.println("Result: " + result02);
    System.out.println("Result: " + result03);
  }
}
