package Week2.StaticMethod;

public class Greeting {

  public static void sayHello(String name){
    System.out.println("Hello, " + name + "!");
  }

  public static void main(String[] args) {
    String person ="John"; // start from here 
    sayHello(person);
  }
}
