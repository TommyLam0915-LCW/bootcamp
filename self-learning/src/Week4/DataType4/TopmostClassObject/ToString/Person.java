package Week4.DataType4.TopmostClassObject.ToString;


// Note 2 : Recommended to override the toString() method to get our own String representation of object.
// We often check te values of the object, but we don't care about the reference of the object.
public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Override the toString() method to provide a custom String representation
  @Override
  public String toString() {
    return "Person: " + name + ", Age: " + age;
  }
}
