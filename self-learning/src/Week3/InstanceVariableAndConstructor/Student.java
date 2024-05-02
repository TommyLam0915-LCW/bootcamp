package Week3.InstanceVariableAndConstructor;

public class Student {
  // Declaration: The object type is associated with a variable name
  // Instantiation: The new operator is used to create the object in Java
  // Initialization: the constructor after the new operator initializes the new objects

  // instance variable with initial value 10
  int i = 10;

  public static void main(String[] args) {
    // You can spilit it into 2 lines, same thing.
    // Student stu: //Simply declaring a reference variable
    // stu = new Students(); //creates an object
    Student stu = new Student();
  }
}
