package Week4.DataType4.Abstraction;

// Interface Body can contain:
// 1.Abstract methods (e.g makeSound) have no braces or method body, only a semicolon
// 2.Default methods (e.g sleep) :
// Default method is for its implementation class to "inherit". For instance / object use
// 3. Static method :
// Static method is a tool which belongs to interface itself ONLY.
// static methods can not be inherited by implementation class.

// Outer interface
public interface MyInterface {

  // Static method in interface
  static void staticMethod() {
    System.out.println("Static method in interface");
  }

  // Inner interface
  public interface InterfaceWithAbstractMethods {
    // Constants are public, static, and final by default
    int someValue = 10;

    // Abstract method declaration
    void doSomething();

    // Default method
    default void doSomethingElse() {
      System.out.println("do something else");
    }

    // Static method
    static void doSomethingStatic() {
      System.out.println("do something static");
    }

    int VOLUME = 5; // Constant, implicity static final

    // default method
    default void newMethod() { // implicitly public
      System.out.println("Hello, this is default method");
    }

    // Abstract method
    void existingMethod(String msg); // implicity public & abstract

    // Static method
    static void sayLouder(String msg) { // implicity public
      System.out.println(msg);
    }
  }
}
