package Week4.DataType4.Polymorphism.DynamicPolymorphism;

public class SubclassA extends ParentClass {

  @Override
  public void doSomething() {
    System.out.println("do something from SubClassA");
  }

  public String getString() {
    return "abc";
  }
}
