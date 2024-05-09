package Week4.DataType4.Encapsulation.EncapsulatesClassState;

// Example 1 : Encapsulates Class's State

public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 0) // validation 
      this.age = age;
  }
}
