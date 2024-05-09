package Week4.Inheritance;

public abstract class Pet {
  protected String name;
  protected int weight;
  protected int height;
  public String someProperty;

  public Pet(String name, int weight, int height) {
    this.name = name;
    this.weight = height;
    this.someProperty = "[Animal] someProperty from Animal...";
  }

  //abstract method must be implemented by subclasses 
  public abstract void makeSound();

  //default method is overriden optionally by subclasses
  public void sleep(){
    System.out.println("[Animal] Zzzzzzzzzz");
  }

  //final method cannot be overridden by subclasses
  public final void deNothing(){
    System.out.println("[Animal] doNothing");
  }

  public static void someStaticMethod(){
    System.out.println("[Animal] Some static method from Animal ...");
  }

  //getters and setters for the remaining fields 
}
