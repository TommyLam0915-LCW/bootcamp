package abstracts;

public class SmallCat extends SuperCat { //Error , because SuperCat is final class

  public SmallCat(int age, String name){
    super(age,name);
  }
}
