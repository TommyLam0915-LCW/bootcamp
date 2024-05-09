package Week4.DataType4.TopmostClassObject.Equals;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Override the equals() method to provide custom equality logic
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Point))
      return false;
    Point point = (Point) obj;
    return this.x == point.x && this.y == point.y;

    // You can write this approach:
    // return Objects.equals(this.x, this.y)
  }

}
