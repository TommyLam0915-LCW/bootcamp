package Week4.DataType4.Abstraction;


// Class C is forced to provide its own implementation
public class ClassC implements InterfaceA, InterfaceB {
  @Override
  public void doSomethingElse() {
    System.out.println("[ClassC] do something else ...");
  }
}

/* 
 * Class C will not compile unless it provides its own implementation of doSomethingElse,
 * hence the diamond problem does not happen when implementing multiple interfaces.
 */
