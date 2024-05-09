package Week5.DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterating {
  public static void main(String[] args) {
    // Iterator<E> iterator():
    // Returns an iterator over the elements in the list.
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
      String name = iterator.next();
      System.out.println(name);
    }

    // ListIterator<E> listIterator():
    // Returns a list iterator over the elements in the list.
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    ListIterator<Integer> listIterator = numbers.listIterator();
    while (listIterator.hasNext()) {
      int number = listIterator.next();
      System.out.println(number);

      // ListIterator<E> listIterator(int index):
      // Returns a list iterator over the elements in the list, starting at the specified index;
      ListIterator<Integer> listIterator02 = numbers.listIterator(1); // Start from index 1 while (listIterator.hasNext())
      while (listIterator02.hasNext()) {
        int number02 = listIterator02.next();
        System.out.println(number02);
      }

    }
  }
}
