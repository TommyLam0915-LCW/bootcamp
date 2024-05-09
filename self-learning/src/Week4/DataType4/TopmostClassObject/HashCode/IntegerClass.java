package Week4.DataType4.TopmostClassObject.HashCode;

public class IntegerClass {

  //Source Code - Integer.class 
  public static int hashCode(int value){
    return value;
  }

  public static void main(String[] args) {
    Integer i1 = 200;
    Integer i2 = 200;
    System.out.println(i1.hashCode() == i2.hashCode()); // true , they have same value 
    System.out.println(i1 == i2); // false , they are different object
  }
}
