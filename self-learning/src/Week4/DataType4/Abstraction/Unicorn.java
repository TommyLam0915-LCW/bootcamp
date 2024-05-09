package Week4.DataType4.Abstraction;

public class Unicorn extends Horse implements Flyer, Runner {
  public static void main(String[] args) {
    Unicorn unicorn = new Unicorn();
    System.out.println(unicorn.speak());
  }
}

// Output: I am able to speak
