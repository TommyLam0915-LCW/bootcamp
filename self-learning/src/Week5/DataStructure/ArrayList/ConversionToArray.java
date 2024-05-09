package Week5.DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionToArray {

  public static void main(String[] args) {
    // Object[] toArray(): Returns an array containing all the elements in the list.
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");

    Object[] namesArray = names.toArray(); //

    System.out.println(Arrays.toString(namesArray)); //[Alice, Bob]

    //<T> T[] toArray(T[] array): 
    // Returns an array containing all the elements in the list; the runtime type of the returned array is that of the specified array.
    String[] namesArray02 = names.toArray(new String[0]);

    System.out.println(Arrays.toString(namesArray02)); //[Alice, Bob]
  }
}
