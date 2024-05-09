package Week4.Inheritance;

public class Pussy extends Pet{
  public String someProperty;

  public Pussy(String name, int weight, int height){
    super (name, height, weight);
    this.someProperty = "[Melody] someProperty ...";
  }

  @Override
  public void makeSound(){
    System.out.println("[Melody] Meowwww");
  }

  @Override 
  public void sleep(){
    System.out.println("[Melody] Meowwwwwww. Zzzzzzz");
  }
  
  public String getSomeProperty(){
    return someProperty;
  }
}
