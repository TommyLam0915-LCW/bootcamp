package Week4.Inheritance;

public class Doggy extends Pet {
  public Doggy(String name , int weight , int height){
    super(name, weight, height);
  }

  @Override 
  public void makeSound(){
    System.out.println("[Doggy] Woof Woof !!");
  }

  @Override 
  public void sleep(){
    System.out.println("[Doggy] Woof Woof .... Zzzzzzzzzz");
  }

  //Static method with the same name as superclass --> thus hiding superclass method 
  public static void someStaticMethod(){
    System.out.println("[Doggy] some static method from Doggy ....");
  }
}


