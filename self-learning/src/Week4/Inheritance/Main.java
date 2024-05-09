package Week4.Inheritance; // Inheritance = 繼承

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.sound(); // Output Animal makes a sound
    animal.getName();

    Dog dog = new Dog();
    dog.barking(); // Output: Dog barks 
    dog.getName(); // Dog object has getName() method

    Cat cat = new Cat();
    cat.getName();
  }
}
