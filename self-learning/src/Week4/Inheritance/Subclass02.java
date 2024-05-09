package Week4.Inheritance;

public class Subclass02 extends Superclass02 {
  public int number = 10;

  public static void main(String[] args) {
    Subclass02 obj = new Subclass02();
    System.out.println(obj.number); // Output: 10
    System.out.println(((Superclass02) obj).number);// Output: 5
    System.out.println(obj.number02);// Output: 5
  }
}
