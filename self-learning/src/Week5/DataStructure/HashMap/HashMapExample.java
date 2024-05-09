package Week5.DataStructure.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {
    // Create a HashMap with integer keys and String Values
    HashMap<Integer, String> studentMap = new HashMap<>();

    // Adding elements to the HashMap
    // put (k key , V value) :
    // Associates the specified value with the specified key in the map.
    studentMap.put(1, "Alice");
    studentMap.put(2, "Bob");
    studentMap.put(3, "Charlie"); // // {1=Alice, 2=Bob, 3=Charlie}

    // get(Object key):
    // Returns the value associated with the specified key, or null if the jey is not found in the map
    String alice = studentMap.get(1); // "Alice"

    // get(Object key):
    // Returns the value associated with the specified key, or null if the key is not found in the map
    String unknownStudent = studentMap.get(4); // null (key 4 not found)

    // remove(Object key):
    // Removes the entry with the specified key from the map, if it exists
    studentMap.remove(1); // Remove the entry with key 1

    // containsKey(Object key): Returns true if the map contains the specified key
    boolean containsUnknownKey = studentMap.containsKey(1); // false
    boolean containsKey = studentMap.containsKey(2); // true

    // isEmpty(): Returns true if the map is empty
    boolean isEmpty = studentMap.isEmpty(); // false

    // size() : Returns the number of key-value mappings in the map.
    int size = studentMap.size(); // 2

    // clear(): Removes all key-value mapping from the map.
    studentMap.clear(); // Removes all entries from the map

    // keySet(): Returns a set containing all the keys in the map.
    HashMap<String, String> studentMap02 = new HashMap<>();
    studentMap02.put("Tommy", "1");
    studentMap02.put("Tony", "2");
    Set<String> keys = studentMap02.keySet(); // Set containing [Tony,Tommy]

    // values(): Returns a collection containing all the values in the map.
    Collection<String> values = studentMap02.values(); // Collection containing [2, 1]

    //entrySet(): Returns a set containing all the key-value mappings in the map as map.Entry objects.
    HashMap<Integer, String> studentMap03 = new HashMap<>();
    studentMap03.put(1, "Tommy");
    studentMap03.put(2, "Sally");
    Set<Map.Entry<Integer, String>> entries = studentMap03.entrySet(); //{1=Tommy, 2=Sally}

    for (Map.Entry<Integer, String> entry : entries){
      int key = entry.getKey();
      String value = entry.getValue();
      System.out.println("Key: " + key + ", Value: "+ value);
    }


    System.out.println(studentMap); // {1=Alice, 2=Bob, 3=Charlie}
    System.out.println(alice);
    System.out.println(unknownStudent);
    System.out.println(studentMap);
    System.out.println(containsUnknownKey);
    System.out.println(containsKey);
    System.out.println(isEmpty);
    System.out.println(size);
    System.out.println(studentMap);
    System.out.println(keys);
    System.out.println(values);
    System.out.println(studentMap03);
  }
}
