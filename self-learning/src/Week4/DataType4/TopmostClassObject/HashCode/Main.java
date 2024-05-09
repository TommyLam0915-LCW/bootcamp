package Week4.DataType4.TopmostClassObject.HashCode;

public class Main {
  public static void main(String[] args) {
    Student s1 = new Student("1001", "Alice");
    Student s2 = new Student("1001", "Alice");

    System.out.println(s1.hashCode()); // represent the object reference of s1
    System.out.println(s2.hashCode()); // represent the object reference of s2
    System.out.println(s1.hashCode() == s2.hashCode()); // false
  }
}
