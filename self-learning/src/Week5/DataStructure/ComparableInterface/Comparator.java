package Week5.DataStructure.ComparableInterface;

//The Comparator interface defines a compare(arg1, arg2) methods which works similarly to the Comparable.compareTo() method,
// except it arguments that represent the objects that are being compared

// The *@FunctionalInterface* annotation means the interface can be used in Lambda expressions 
@FunctionalInterface
public interface Comparator<T> {
  int compare(T o1, T o2);
}
