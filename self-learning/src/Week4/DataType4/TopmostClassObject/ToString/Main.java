package Week4.DataType4.TopmostClassObject.ToString;

public class Main {
  public static void main(String[] args) {
    Person person = new Person("Vincent Lau", 30);
    System.out.println(person); // This will call the overriden toString() method
  }
}
