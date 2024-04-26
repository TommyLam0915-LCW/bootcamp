import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random; // Fixed import statement

public class SortByColor implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    // Compare balls based on the first character of their color names
    return Character.compare(b1.getColor().name().charAt(0),
        b2.getColor().name().charAt(0));
  }

  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.BLACK, 10.3));
    balls.add(new Ball(Color.BLACK, 11.1));
    balls.add(new Ball(Color.RED, 2.0)); // Fixed typo in size declaration

    int random = new Random().nextInt(2); // Generates 0 or 1
    Comparator<Ball> formula = null;
    // if (random == 1) { // Corrected index check, should be 1 instead of 2
    // formula = new SortByColor();
    // } else {
    // formula = new SortBySize();
    // }
    // Sort the balls using the chosen comparator
    Collections.sort(balls, getFormula(random));
    System.out.println(balls);
  }

  public static Comparator<Ball> getFormula(int num) { // enum
    if (num == 0) { // Corrected index check, should be 1 instead of 2
      return new SortByColor();
    } else if (num == 1) {
      return new SortBySize();
    }
    return null;
  }
}

