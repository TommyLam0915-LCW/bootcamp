package Week3.InstanceMethod.PassByValue.ReturningAnInterface;

public class Rabbit implements Animal {
  @Override
  public String makeSound() {
    return "Squeak";
  }
}
