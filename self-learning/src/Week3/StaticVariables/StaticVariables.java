package Week3.StaticVariables;

public class StaticVariables {
  Person person1 = new Person();

  // Recommended -- Invoking static method with class name
  Person.someStaticMethod();

  // Not Recommended -- Invoking static method with  Object reference 
  person1 .someStaticMethod();
}
