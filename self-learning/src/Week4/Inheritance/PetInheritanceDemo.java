package Week4.Inheritance;

public class PetInheritanceDemo {
  public static void main(String[] args) {
    // Animal animal = new Animal(); // Compilation error 
    Pussy pussy = new Pussy("Garfield",10,10);
    Doggy doggy = new Doggy("Gofy", 30, 30);

    pussy.makeSound();
    pussy.sleep();

    doggy.makeSound();
    doggy.sleep();

    System.out.println("someProperty: " + pussy.someProperty);
    System.out.println("getSomeProperty: " + pussy.getSomeProperty());

    Pet.someStaticMethod();
    Doggy.someStaticMethod();
  }
}
/*
Output: 

[Melody] Meowwww
[Melody] Meowwwwwww. Zzzzzzz
[Doggy] Woof Woof !!
[Doggy] Woof Woof .... Zzzzzzzzzz
someProperty: [Melody] someProperty ...
getSomeProperty: [Melody] someProperty ...
[Animal] Some static method from Animal ...
[Doggy] some static method from Doggy ....

 */
