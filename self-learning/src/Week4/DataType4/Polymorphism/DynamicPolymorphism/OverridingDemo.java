package Week4.DataType4.Polymorphism.DynamicPolymorphism;

public class OverridingDemo {
  public static void main(String[] args) {
    ParentClass o1 = new ParentClass();
    ParentClass o2 = new SubclassA();
    ParentClass o3 = new SubclassB();

    o1.doSomething();
    o2.doSomething();
    o3.doSomething();
    // o2.getString() -> Compile error, ParentClass has NO getString method

    SubclassA s1 = (SubclassA) o1; // Downcast, risky

    // Solution
    if (o1 instanceof SubclassA) {
      SubclassA s2 = (SubclassA) o1; // Safe
    } else if (o1 instanceof SubclassB) {
      SubclassB s3 = (SubclassB) o1; // Safe
    }
  }
}
/*
 * Output: do something from ParentClass 
 * do something from SubClassA 
 * do something from SubClassB
 */

