package Week4.DataType4.TopmostClassObject.Equals;

public class Main {
  public static void main(String[] args) {
    Point p1 = new Point(2, 3);
    Point p2 = new Point(2, 3);

    // This will call the equals() method inherited forom Object.class

    System.out.println(p1.equals(p2)); // false(without override equals()), they are different objects 
  }
}
