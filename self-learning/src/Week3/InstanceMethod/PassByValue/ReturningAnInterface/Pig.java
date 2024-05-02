package Week3.InstanceMethod.PassByValue.ReturningAnInterface;

public class Pig implements Animal {
  @Override
  public String makeSound() {
    return "abc";
  }

  // @Override
  // public String makeSound(){
  //   return "mmm";
  // }
}
