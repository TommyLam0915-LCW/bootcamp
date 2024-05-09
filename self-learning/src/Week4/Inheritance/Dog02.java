package Week4.Inheritance;


public class Dog02 extends Animal02 {
  @Override
  void doSomething(int x, int y) {
    System.out.printf("x is %s, y is %s\n", x, y);
  }

  public static void main(String[] args) {
    Dog02 dog02 = new Dog02();
    dog02.doSomething(1, 2);
  }
}

// Output: x is 1 , y is 2
