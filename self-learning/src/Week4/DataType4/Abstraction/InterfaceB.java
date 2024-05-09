package Week4.DataType4.Abstraction;

public interface InterfaceB {
  // after java 8 
  default void doSomethingElse(){
    System.out.println("[InterfaceB] do something else ... ");
  }
}
