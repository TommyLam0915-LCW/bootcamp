package Week4.DataType4.TopmostClassObject.getClass;

import Week3.StaticVariables.Person;

public class Demo {
  public static void main(String[] args) {
    // Create an instance of the Person class
    Person person = new Person("Vincent", 40);

    // Use getClass() to get the runtime class of the object
    Class<?> childClass = person.getClass();

    // Print the class name
    System.out.println("Runtime class: " + childClass.getName());

    // Get the superclass of the runtime class 
    Class<?> superClass = childClass.getSuperclass();
    System.out.println("Superclass: " + superClass.getName());
  }
}

