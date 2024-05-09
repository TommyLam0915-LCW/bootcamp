package Week3.FinalVariable;

public class MyClass02 {
  final int instanceFinal; // if instanceFinal is static final, compile error. WHY?

  public MyClass02(int value) {
    instanceFinal = value;
  }

  public static void main(String[] args) {
    MyClass02 obj1 = new MyClass02(10);
    MyClass02 obj2 = new MyClass02(20);

    System.out.println(obj1.instanceFinal); // Output: 10
    System.out.println(obj2.instanceFinal); // Output: 20
  }
}
