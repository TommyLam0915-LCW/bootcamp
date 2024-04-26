package src;

public class Calculator<T extends Number> {

  private T x;
  private T y;

  public double sum3(T x, T y) {
    return x.doubleValue() + y.doubleValue(); // Fixed: Use x and y instead of x twice
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static double sum(double x, double y) {
    return x + y;
  }

  // "<T extends Number>" implies x and y are the objects that
  // belong to the class of Byte, Short, Integer, Long, Double, Float
  public static <T extends Number> double sum(T x, T y) {
    // Byte, Short, Integer, Long, Double, Float
    return x.doubleValue() + y.doubleValue(); // BigDecimal
  }

  public static double sum2(Number x, Number y) {
    return x.doubleValue() + y.doubleValue(); // BigDecimal
  }

  public static void main(String[] args) {
    // You need to specify the return type here
    System.out.println(sum(2, 3)); // 5.0
    System.out.println(sum(2, 3L)); // 5.0
    System.out.println(sum(2, 3.3d)); // 5.3
    System.out.println(sum(2.3f, 3.2d)); //

    // Compile-time > Type-Safety
    // Limit the type range of x and y, so that x and y must be able to call doubleValue()

    // Run-time -> Polymorphism
    // s.doublevalue() -> find the float object in heap, we are calling the float.doubleValue()
  
    //
    Calculator<Long> calculator = new Calculator<>();
    System.out.println(calculator.sum3(Long.valueOf(10), Long.valueOf(20)));

    Calculator.sum(3.2d, 3.4d); //static method

    calculator.sum(new SuperLong(), new SuperLong());
  }
}
