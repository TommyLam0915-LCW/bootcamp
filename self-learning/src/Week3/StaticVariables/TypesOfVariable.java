package Week3.StaticVariables;

public class TypesOfVariable {
  // Instance variables (non - static fields) - State of individual object which can be different between objects of the same class, such as a person's age

  // Class variables (static fields) - A class-level variable shared by all objects of that class

  // Local variables - Variable declared within a method or code block

  // Parameters - The list of variables in a method declaration

  int count = 100; // instance variable
  static int a = 5; // class variable

  static int addMethod(int value) { // parameter 
    int b = 77;
    b = b + value;
    return b;
  }
}
