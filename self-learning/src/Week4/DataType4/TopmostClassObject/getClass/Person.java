package Week4.DataType4.TopmostClassObject.getClass;

public class Person {
  private String name;
  private int age;

  // Constructor with parameters (String, int)
  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  // Getters for name and age
  public String getName() {
      return name;
  }

  public int getAge() {
      return age;
  }
}

