package Week5.DataStructure.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
  public static void main(String[] args) {
    //Create a LinkedList of Strings 
    LinkedList<String> names = new LinkedList<>();

    // Adding elements to the LinkedList 
    // add (E element ): Adds the specified elements to the end of the list.
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    // add (int index, E element ): Adds the specified elements at the given index in the list.
    names.add(0, "Alice"); // Adds "Alice" at index 0

    //remove(int index): Removes the element at the given index from the list.
    names.remove(0); // Removes the element at index 0 ("Alice")

    // get(int index): Retrives the element at the given index from the list.
    String firstElement = names.get(0); // Retrieves the element at index 0 ("Alice")

    // size(): Returns the number of elements in the list.
    int size = names.size(); // size is 3 

    //clear(): Removs all the elements from the list.
    names.clear(); // removes all elements from the list 

    //contains(Object obj): Returns true if the list contains the specified element.
    names.add("Alice");
    boolean containsAlice = names.contains("Alice"); // true
    boolean containsBob = names.contains("Bob"); // false

    System.out.println(names);
    System.out.println(firstElement);
    System.out.println(size);
    System.out.println(containsAlice);
    System.out.println(containsBob);
  }
}
