package Week3.InstanceMethod.PassByValue;

public class WrapperClass {
  public static void doSomething(String name) { // String is immutable, as well
    name = "LAB";
    System.out.println(name); // print "LAB"
  } // Output "LAB"

  public static void main(String[] args) {
    String name = new String("Venturenix");
    doSomething(name);
    System.out.println(name); // print "Venturenix"
  } // Output" "Venturenix"
}
