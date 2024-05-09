package Week4.Enum;

public enum Direction {
  EAST(2, 'E', "it is East"), SOUTH(-1, 'S', "it is South"), WEST(-2, 'W',
      "it is West"), NORTH(1, 'N', "it is North");

  private int code;
  private char dbValue;
  private String description;

  private Direction(int code, char dbValue, String description) {
    this.code = code;
    this.dbValue = dbValue;
    this.description = description;
  }

  public int getCode() {
    return this.code;
  }

  public char getDbValue() {
    return this.dbValue;
  }

  public String getDescription() {
    return this.description;
  }

  public Direction opposite() {
    return Direction.get(this.code * -1);
  }

  public static boolean isOpposite(Direction d1, Direction d2) {
    return d1.getCode() * -1 == d2.getCode();
  }

  public static Direction get(int code) { // overloading
    for (Direction d : values()) {
      if (d.code == code)
        return d;
    }

    // return null;
    throw new IllegalArgumentException(
        "Cannot parse into an element of Direction by code : ' " + code
            + " ' ");
  }

  public static Direction get(char dbValue) { // overload
    for (Direction d : values()) {
      if (d.dbValue == dbValue)
        return d;
    }

    //return null;
    throw new IllegalArgumentException(
      "Cannot parse into an element of Direction dbValue: '" + dbValue + "'"
    );
  }
}
