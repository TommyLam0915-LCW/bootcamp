package Week5.DataStructure.ArrayList;

import java.util.ArrayList;

public class BulkOperations {
  // boolean addAll(Collection<? extends E> collection) :
  // Adds all elements from the specified collection to the end of the list.
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    ArrayList<String> newNames = new ArrayList<>();
    newNames.add("Charlie");
    newNames.add("David");

    names.addAll(newNames);

    System.out.println(names); // [Alice, Bob, Charlie, David]

    // boolean addAll(int index, Collection<? extends E> collection):
    // Insert all elements from the specified collection into the list, starting at the specified index
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);

    ArrayList<Integer> newNumbers = new ArrayList<>();
    newNumbers.add(30);
    newNumbers.add(40);
    numbers.addAll(newNumbers);

    System.out.println(numbers); // [10, 20, 30, 40]

    ArrayList<String> toRetain = new ArrayList<>();
    toRetain.add("Alice");
    toRetain.add("Bob");

    names.retainAll(toRetain); // [Alice, Bob]

    System.out.println(toRetain); 
  }
}
