package Week4.Enum;

public class EnumDemo04 {
  public static void main(String[] args) {
    System.out.println(Direction.get('N')); // print NORTH
    System.out.println(Direction.get(-1)); // print SOUTH
    System.out.println(Direction.WEST.opposite()); // print EAST
    System.out.println(Direction.isOpposite(Direction.SOUTH, Direction.NORTH)); // print true
    System.out.println(Direction.isOpposite(Direction.SOUTH, Direction.EAST)); // print false
    System.out.println(Direction.valueOf("NORTH")); // print NORTH
    System.out.println(Direction.NORTH); // print NORTH
    System.out.println(Direction.NORTH.name()); // print NORTH
  }
}
