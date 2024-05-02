package Week3.InstanceMethod.PassByValue.ReturningAnInterface;

public class Cow implements Animal{
  @Override 
  public String makeSound(){
    return "Moooooo";
  }
}
