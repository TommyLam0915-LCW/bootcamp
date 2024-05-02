package Week3.InstanceMethod.PassByValue.ReturningAnInterface;

// We can return an interface and still be able to
public class RunningInterface {
  public static void main(String[] args) {
    int type = 4;
    Animal animal = getAnimal(type);
    System.out.println(animal.makeSound());
  }

  // Cow can be return type also.
  public static Animal getAnimal(int type) { // just because Cow implements Animal
    if (type == 1) {
      return new Cow();
    } else if (type == 2) {
      return new Rabbit();
    }
    return new Pig();
  }
}
