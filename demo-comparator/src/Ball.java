import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball> {
    private Color color;
    private double size;

    public Ball(Color color, double size) {
        this.color = color;
        this.size = size;
    }

    public double getSize() {
        return this.size;
    }

    public Color getColor() {
        return this.color;
    }

    // Override compareTo method to sort Balls based on color and size
    @Override
    public int compareTo(Ball b) {
        // Compare color first, if colors are equal, then compare size
        if (this.color == b.getColor()) {
            return Double.compare(this.size, b.getSize()); // Compare sizes
        } else {
            // Order balls with BLACK color first, then others
            return this.color == Color.BLACK ? -1 : 1;
        }
    }

    @Override
    public String toString() {
        return "Ball(" + "size = " + this.size +
                ", color = " + this.color + ")"; // Added missing comma
    }

    public static void main(String[] args) {
        List<Ball> balls = new LinkedList<>();
        balls.add(new Ball(Color.BLACK, 10.3));
        balls.add(new Ball(Color.BLACK, 11.1));
        balls.add(new Ball(Color.RED, 2.0)); // Fixed typo in size declaration
        Collections.sort(balls); // Corrected method name and usage
        System.out.println(balls);

        // Print sorted list
        for (Ball ball : balls) {
            System.out.println("Color: " + ball.getColor() + ", Size: " + ball.getSize()); // Corrected method name
        }
    }
}