package Week5.DataStructureAlgorithm.DsaComplexity;

import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
    // 1. Constructor ArrayList(), Create an empty array of integers 
    ArrayList<Integer> integers = new ArrayList<>();

    // Add numbers from 0 to 9 to an array 
    for (int i =0; i<10; i++){
      integers.add(i);
    }
    System.out.println(integers); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    // 2. Create an array of strings based on another array of strings , constructor Arraylist()
    // 2.1. Create a source array 
    ArrayList<String> strings = new ArrayList<>();
    strings.add("Winter");
    strings.add("Summer");
    strings.add("Autumn");
    strings.add("Spring");
    System.out.println(strings);  // [Winter, Summer, Autumn, Spring]

    // 2.2. Use constructor ArrayList(Collection<? extends E>)
    ArrayList<String> strings2 = new ArrayList<>(strings); // copy Array
    System.out.println(strings2); // [Winter, Summer, Autumn, Spring]
  }
}
