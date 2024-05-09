package Week4.Inheritance;

public class ClassE extends ClassD{
  @Override
  public String getString(){ //private is NOT allowed in this Override method 
    return "returnSomething from classE"
  }
}
