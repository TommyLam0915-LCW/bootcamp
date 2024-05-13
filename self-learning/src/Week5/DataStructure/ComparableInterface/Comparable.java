package Week5.DataStructure.ComparableInterface;

// Comparable : is an interface that defines a strategy of comparing an object against other objects of the same type.
// This is called the class's natural ordering.

public interface Comparable<T> {
  public int compareTo(T o);
}
