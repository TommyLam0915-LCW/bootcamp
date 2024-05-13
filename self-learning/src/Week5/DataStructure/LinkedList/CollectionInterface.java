package Week5.DataStructure.LinkedList;

import java.util.LinkedList;

public class CollectionInterface {
  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<>();
    // add(E element): Adds the specified element to the collection
    names.add("Alice");

    // remove (Object obj) : Removes the first occurrence of the specified element from the collection.
    names.add("Alice");
    names.remove("Alice"); // Removes "Alice" from the collection

    // addAll(Collection<? extends E> c):
    // Adds all elements from the specified collection to the collection.
    LinkedList<String> othernames = new LinkedList<>();
    othernames.add("Alice");
    othernames.add("Charlie");

    names.addAll(othernames); // Adds all elements from otherNames to names

    // clear(): Removes all elements from the collection.
    names.clear(); // Removes all elements from the collection

    // contains(Object obj): Returns true if the collection contains the specific element.
    names.add("Alice");
    boolean containsAlice = names.contains("Alice"); // true
    boolean containsBob = names.contains("Bob"); // false

    //isEmpty():Returns true if the collection is empty.
    names.clear();
    boolean isEmpty = names.isEmpty(); // true 

    //size() : Returns the number of elements in the collection
    names.add("Alice");
    names.add("Bob");
    int size = names.size(); // size is 2

    //toArray(): Returns an array containing all the elements of the collection.
    Object[] array = names.toArray(); //array contains ["Alice", "Bob"]


    System.out.println(names);
    System.out.println(containsAlice);
    System.out.println(containsBob);
    System.out.println(isEmpty);
    System.out.println(size);

  
  }
}
