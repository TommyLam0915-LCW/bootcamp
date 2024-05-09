package Week4.DataType4.Abstraction;

import Week3.InstanceMethod.PassByValue.ReturningAnInterface.Animal;

public interface FarmAnimal extends Animal {
  String FARM_ANIMAL_NAME_PREFIX = "Old McDonald"; // Constant, implicitly

  void makeSound();

  default void sleep() { // After Java 8
    System.out.println("Zzzzzzzz");
  }

  static boolean is NameValid(String name){ //After Java 8
    return name.contains(FARM_ANIMAL_NAME_PREFIX);
  }
}
