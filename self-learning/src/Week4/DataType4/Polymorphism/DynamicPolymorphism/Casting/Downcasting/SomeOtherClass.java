package Week4.DataType4.Polymorphism.DynamicPolymorphism.Casting.Downcasting;

public class SomeOtherClass extends ParentClass {

  public void otherMethod() {
    System.out.println("print something");
  }

  // Factory Pattern
  public static ParentClass produceChild(int count) {
    switch (count) {
      case 1:
        return new SubclassC();
      case 2:
        return new SomeOtherClass();
      default:
        return null;
    }
  }
}
