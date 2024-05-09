package Week4.Inheritance; // Inheritance = 繼承

public class Animal {
  private String name;
  private int age;
  private int weight;

  void sound() {
    System.out.println("Animla makes a sound");
  }

  public String getName() {
    return this.name;
  }
}
