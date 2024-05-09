package Week5.DataStructure.ArrayList;

import java.util.ArrayList;

public class CheckingArrayListSize {
  public static void main(String[] args) {
    // int size(): Return the number of elements in the list
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Jacky");
    int size = names.size(); // 2

    // boolean isEmpty(): Returns true if the list is empty(contains no elements).
    ArrayList<String> name = new ArrayList<>();
    boolean isEmpty = name.isEmpty(); // true

    System.out.println(size);
    System.out.println(isEmpty);
  }
}
