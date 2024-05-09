package Week4.DataType4.Abstraction;

public interface InterfaceA {
  // after java 8 
  default void doSomethingElse(){
    System.out.println("[InterfaceA] do something else ... ");
  }
}
