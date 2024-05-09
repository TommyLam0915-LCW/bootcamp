package Week5.DataStructure;

import java.util.ArrayList;

public class ArrayAndArrayList {
  public static void main(String[] args) {
    // Array: Arrays are declared using square brackets] [],
    // are fixed size (If need change size , Need to create a new array and copy elements frokm the old array)

    int[] arr = new int[5]; // Declaration and initialization
    // cannot change the size

    // ArrayList: ArrayList is a collectiond Framework
    // Can dynamically grow and shrink in size.

    ArrayList<Integer> arrayList = new ArrayList<>(); // Declaration and initialization
    // Size can grow or shrink as elements are added or removed


    // Peformance
    // Array: better performance in terms of accessing elements
    // becasues elements are stored in continguos memory locations.

    // ArrayList: Accessing elements is slightly slower
    // due to the additional overhead of indexing and object-oriented features

    Integer[] integers = new Integer[3];
    // During run -time, you will get error if assigning another array object to "integers"
    // So, it is not Type-Safety during runtime.

    ArrayList<String> strings = new ArrayList<>();
    // You will get compile-time error, instead of run-time error
    // if you assign another type of ArrayList to "strings"
    // So, it ensures the Type-Safty during runtime.

    // Use Cases
    // Array; When you know the fixed size
    // ArrayList: When you need dynamic and flexible data structure

  }

}
