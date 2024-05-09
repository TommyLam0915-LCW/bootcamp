package Week5.DataStructure.ArrayList;

import java.util.ArrayList;

public class AccessingElements {

  public static void main(String[] args) {
    // E get(int index):
    // Remove the elements at the specified index from the list and returns the moved element
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    String firstPerson = names.get(0); // "Alice"
    // E set (int index, E element):
    // Replaces the element at the specified index with the specified element
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.set(1, 30); // numbers : [10,30]


    System.out.println(firstPerson);
    System.out.println(numbers);
  }
}
