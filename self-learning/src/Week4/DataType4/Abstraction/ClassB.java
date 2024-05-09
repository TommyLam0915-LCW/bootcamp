package Week4.DataType4.Abstraction;

public class ClassB {
  public void doSomething() {
    System.out.println("[Class B] do something from class B ...");
  }
}
/*
 * If a class is allowed to extend both ClassA nad ClassB,
 * it will inherit the *doSomething* method from both classes 
 * and leave the compiler confused which method to use at runtime
 */
