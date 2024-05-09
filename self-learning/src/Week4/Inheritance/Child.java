package Week4.Inheritance;

public class Child extends Parent {

  public static void display() {
    System.out.println("SubClass");
  }

  public static void main(String[] args) {
    Parent.display(); // Output: SuperClass
    Child.display(); // Output: SubClass

    Parent parent = new Child(); // Chapter 17: Polymorphism
    parent.display(); // Output: SuperClass
  }
}

