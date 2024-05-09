package Week4.DataType4.Abstraction;

// By convention, the implements clause follows the extends clause, if there is one
public class Pig extends SomeClass implements FarmAnimal02 {
  private final String name;
  // Thsi class Pig has sleep method & the static method isNameValid()
  public Pig(String name){
    if (!FarmAnimal02.isNameValid(name)){
      throw new IllegalArgumentException("Invalid name");
    }
    this.name = name;
  }

  @Override
  public void makeSound(){
    System.out.println("Oink Oink");
  }

  @Override
  public void move(){
    System.out.println("Pig is moving..");
  }

  @Override
  public void eat(){
    System.out.println("Pig is eating..");
  }

  @Override
  public void breath(){
    System.out.println("Pig is braething..");
  }
}
