package Week5.DataStructure.ArrayList;

import java.util.ArrayList;

public class RemovingElements {
  public static void main(String[] args) {
     // Boolean remove(Object element): Remove the first occurrence of the specified element from the list
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> numbers = new ArrayList<>(); 
    names.add("Alice");
    names.add("Bob");
    names.remove("Alice"); // names: ["Bob"]

    numbers.add(10);
    numbers.add(20);
    int removedNumber = numbers.remove(1);

    System.out.println(names);
    System.out.println(numbers);
  }
}
