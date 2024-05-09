package Week3.StaticVariables;

public class Person {
  private int id;
  private int age;
  private static int counter = 0;

  public Person() {
    this.id = ++counter;
  }

  public int getID() {
    return id;
  }

  // getter and setter for age

  public static int getCounter() {
    return counter;
  }

  public static void setCounter(int counter) {
    Person.counter = counter;
  }
}


