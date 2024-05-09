package Week5.DataStructure.HashSet;

import java.util.HashSet;

public class HashSetExample {
  public static void main(String[] args) {
    // Create a HashSet of Strings
    HashSet<String> namesSet = new HashSet<>();

    // Adding elements to the HashSet
    namesSet.add("Alice");
    namesSet.add("Bob");
    namesSet.add("Charlie");

    System.out.println(namesSet); // [Bob, Alice, Charlie]

    // Removing (Object obj) : Removes the specified elements from the set if it exists 
    namesSet.add("Alice");
    namesSet.remove("Alice"); // Removes "Alice" form the set
    System.out.println(namesSet);  // [Bob, Charlie]
    
    //addAll(Collection<? extends E> c): Adds all elements from the specified collection to the set.
    HashSet<String> otherNameSet = new HashSet<>(); 
    otherNameSet.add("Bob");
    otherNameSet.add("Charlie");

    namesSet.addAll(otherNameSet); //Adds all elements from otherNamesSet to namesSet
    System.out.println(namesSet); // [Bob, Charlie]

    // clear() : Removes all elements from the set.
    namesSet.clear(); // Removes all elements from the set
    System.out.println(namesSet); // []

    // contains(Object obj): Returns true if the set contains the specified element.
    namesSet.add("Alice");
    boolean containsAlice = namesSet.contains("Alice"); // true 
    boolean containBob = namesSet.contains("Bob"); // false 
    System.out.println(containsAlice); 
    System.out.println(containBob);

    // isEmpty() : Returns true if the set is empty
    boolean isEmpty = namesSet.isEmpty(); // false 

    // size(): Returns the number of elements in the set.
    int size = namesSet.size();
    System.out.println(size); // size is 1 

  }
}
