package Week5.DataStructure.ArrayList;

import java.util.ArrayList;

public class AddingElements // <E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable{
{
  // Boolean add (E elements) : Adds the specified element to the end of the list
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");

    // void add(int index, E element): Insert the specified element at the specified index, shifting the subsequent elements to the right.
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(0, 10); // numbers:[10]
    numbers.add(1, 20); // numbers: [10,20]

    // Print the elements of the ArrayList
    System.out.println(names);
    System.out.println(numbers);
    }
  }

