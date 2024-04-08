import java.util.Arrays;

public class demoMethodArray {
  public static void main(String[] args) {
    double[] prices = new double[] {2.0, 9.8, 5.6};
    int[] quantities = new int[] {2, 4, 5};

    double totalAmount = total(prices, quantities);
    System.out.println("totalAmount=" + totalAmount);

    //
    double amount = demoMethodArray.total(prices, quantities);
    System.out.println(ABC.hello()); // "hello"

    String[] arr = new String[] {"aaa", "bbb"};
    String[] arr2 = trimSpace(arr);
    System.out.println(Arrays.toString(arr2)); // [aaa, bbb]

    // pass by reference example
    trimSpace2(arr, " ");
    System.out.println(Arrays.toString(arr2));
  }

  public static Integer sum(Integer x, Integer y) { // pass by value
    return x + y; // int + int -> int -> autobox
  }

  public static String trimSpace(String s) { // pass by value (a copy of the orginal string object)
    return s.replace(" ", "");
  }

  // return {"aaa","bbb"}
  public static String[] trimSpace(String[] arr) { // pass by reference (address)
    String[] strings = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      strings[i] = arr[i].replace(" ", "");
    }
    return strings; // returning string array object address
  }

  public static void trimSpace2(String[] arr, String s) { // pass by reference (address)
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i].replace(" ", "").concat(s);
    }
  }

  // Method: totalAmount -> call subTotal()
  public static double total(double[] prices, int[] quantities) {
    int totalAmount = 0;
    for (int i = 0; i < prices.length; i++) {
      totalAmount += subTotal(prices[i], quantities[i]);
    }
    return totalAmount;
  }

  // Method: subTotal (double price, int quantitiy)
  public static double subTotal(double price, int quantity) {
    return price * quantity; // double value * double value
  }
}
