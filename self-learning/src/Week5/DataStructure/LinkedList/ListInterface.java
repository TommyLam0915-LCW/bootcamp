package Week5.DataStructure.LinkedList;

// Methods in List Interface

import java.util.LinkedList;
import java.util.List;

public class ListInterface {
  public static void main(String[] args) {
    // Create a LinkedList of Strings
    LinkedList<String> names = new LinkedList<>();

    // Adding elements to the LinkedList
    // add (E element ): Adds the specified elements to the end of the list.
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    // add (int index, E element ): Adds the specified elements at the given index in the list.
    names.add(0, "Alice"); // Adds "Alice" at index 0

    // remove(int index): Removes the element at the given index from the list.
    names.remove(0); // Removes the element at index 0 ("Alice")

    // get(int index): Retrives the element at the given index from the list.
    String firstElement = names.get(0); // Retrieves the element at index 0 ("Alice")

    // size(): Returns the number of elements in the list.
    int size = names.size(); // size is 3

    // clear(): Removs all the elements from the list.
    names.clear(); // removes all elements from the list

    // contains(Object obj): Returns true if the list contains the specified element.
    names.add("Alice");
    boolean containsAlice = names.contains("Alice"); // true
    boolean containsBob = names.contains("Bob"); // false

    // isEmpty(): Returns true if the list is empty
    boolean isEmpty = names.isEmpty(); // false

    // indexOf(Object obj):
    // Returns the index of the first occurrence of the specified element in the list,
    // or -1 if the element is not found
    int indexAlice = names.indexOf("Alice"); // 0
    int indexCharlie = names.indexOf("Charlie"); // -1

    // lastIndexOf(Object obj):
    // Returns the index of the last occurrence of the specified element in the list,
    // or -1 if the element is not found
    int lastIndexAlice = names.lastIndexOf("Alice"); // 0
    int lastIndexCharlie = names.lastIndexOf("Charlie"); // -1


    // set(int index, E element): Replace the elements at the specified index with the given element.
    names.add("Alice");
    names.set(0, "Bob"); // Replace "Alice" with "Bob" at index 0

    // addAll(Collection<? extends E> c): Adds all element from the specified collection to the end of the list.
    LinkedList<String> otherNames = new LinkedList<>();
    otherNames.add("Bob");
    otherNames.add("Charlie");

    names.addAll(otherNames); // Adds all elements from otherNames to the end of names

    // addAll(int index, Collection<? extends E> c):
    // Adds all elements from the specified collection at the specified index in the list.
    names.addAll(0, otherNames); // Adds all elements from otherNames at index 0 in names

    // subList(int fromIndex, int toIndex):
    // Returns a view of the portion of the list between the specified fromIndex(inclusive) and toIndex (exclusive).
    names.add("Jenny");
    names.add("Michelle");

    List<String> sublist = names.subList(1, 3); // sublist contains ["Charlie","Bob"]

    System.out.println(names);
    System.out.println(firstElement);
    System.out.println(size);
    System.out.println(containsAlice);
    System.out.println(containsBob);
    System.out.println(isEmpty);
    System.out.println(indexAlice);
    System.out.println(indexCharlie);
    System.out.println(lastIndexAlice);
    System.out.println(lastIndexCharlie);
    System.out.println(sublist);
  }
}
