package Week5.DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Sublist {


  public static void main(String[] args) {
    // List<E> sublist(int fromIndex, int toIndex):
    // Returns a view of the portion of the list between the specified fromIndex (inclusive) and toIndex(exclusive).
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    List<Integer> subList = numbers.subList(1, 3); // [20, 30]

    System.out.println(subList);
    System.out.println(numbers); // [10, 20, 30]
  }
}
