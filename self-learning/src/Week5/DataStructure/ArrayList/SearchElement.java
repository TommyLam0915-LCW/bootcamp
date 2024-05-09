package Week5.DataStructure.ArrayList;

import java.util.ArrayList;

public class SearchElement {
  public static void main(String[] args) {
    // int indexof(Object element):
    // Returns the index of the first occurrence of the specified element in the list.
    // Return -1 if the element is not found.
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Alice");
    int index = names.indexOf("Bob"); // 1

    // int lastIndexOf(Object Element): 
    //Returns the index of the last occurence of specified element in the list.
    // Returns -1 if the element is not found.
    int lastIndex = names.lastIndexOf("Alice"); // 2

    //boolean contains(Object element): 
    //Returns true if the list contains the specified element.
    boolean containsBob = names.contains("Bob"); // true 

    System.out.println(index);
    System.out.println(lastIndex); 
    System.out.println(containsBob);
  }

}
