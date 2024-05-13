package Week5.DataStructureAlgorithm.DsaComplexity;


// It allocates memory at compile-time whose size is fixed , we cannot alter the static array
public class StaticArray {


  private static String[] arr; // declaration

  static {
    arr = new String[3]; // initialization
    arr[0] = "Hi";
    arr[1] = "Hello";
    arr[2] = "How are you";
  }

  public static void main(String[] args) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);

      // Output:
     // Hi
     // Hello
     // How are you
    }
  }
}
