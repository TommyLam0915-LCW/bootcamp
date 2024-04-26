package src.Shape;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public interface Shape {
    // attribute
    double area();

    // static method to calculate total area of a list of shapes
    static double area(List<? extends Shape> shapes) {
        BigDecimal bd = BigDecimal.valueOf(0.0d);
        for (Shape s : shapes) {
            bd = bd.add(BigDecimal.valueOf(s.area()));
        }
        return bd.doubleValue();
    }

    // Generic static method to calculate total area of a list of shapes
    public static <T extends Shape> double area2(List<T> shapes) { // List<Object>
        BigDecimal bd = BigDecimal.valueOf(0.0d);
        for (Shape s : shapes) {
            bd = bd.add(BigDecimal.valueOf(s.area()));
        }
        return bd.doubleValue();
    }

    static <T extends Collection<Number>> double area3(T shape) {
        // Queue<Number>
        // Set<Number>
        // List<Number>
        return -1;
    }

    // Polymorphism -> Type (Approach 1)
    static <T extends Number> double area4(Queue<T> shape) { // Queue<Short>
        // Queue<Long>
        // Queue<Short>
        return -1;
    }

    // Polymorphism -> Type (Approach 2)
    static double area5(Queue<? extends Number> shape) {
        // Queue<Long>
        // Queue<Short>
        return -1;
    }

    static double area6(Queue<? super Long> shape) {
        // This method accepts a queue that can hold Long or its superclasses.
        // For example, it can accept Queue<Number>, Queue<Integer>, etc.
        return -1;
    }

    public static void main(String[] args) {
        Circle c = new Circle(3.0d);
        Square s = new Square(5.0d);
        List<Shape> shapes = new LinkedList<>();
        shapes.add(c);
        shapes.add(s);

        // List<Object> shapes2 = new LinkedList<>();
        // shapes2.add(new Circle(3.4d)); // Adding a shape to the list

        Queue<Long> ql = new LinkedList<>();
        ql.add(1L);
        Shape.area3(ql);

        Set<Number> sn = new HashSet<>();
        sn.add(1L);
        Shape.area3(sn);

        Queue<Long> ql2 = new LinkedList<>();
        ql2.add(4L);
        Shape.area4(ql2);
    }
}
