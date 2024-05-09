package Week3.StaticVariables;

public class StaticDemo {
  public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person();
    Person person3 = new Person();
    Person person4 = new Person();
    Person person5 = new Person();

    System.out.println("Person1's id : " + person1.getID()); // prints 1
    System.out.println("Person2's id : " + person2.getID()); // prints 2
    System.out.println("Person3's id : " + person3.getID()); // prints 3
    System.out.println("Person4's id : " + person4.getID()); // prints 4
    System.out.println("Person5's id : " + person5.getID()); // prints 5
    System.out.println("Person's Counter : " + Person.getCounter()); // prints 5

    Person.setCounter(100);
    Person person6 = new Person();
    System.out.println("Person6's id : " + person6.getID()); // prints 101
  }
}
