package Exercise;

public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.


  public static void main(String[] args) {
    int n = 15;
    int [] number = new int [n];

    number[0] = 0;
    number[1] = 1;

    for (int i = 2; i<n;i++){
      number[i] = number[i-1] + number[i-2];
    }

    for (int i =0; i<n;i++){
      System.out.println(number[i]);
    }
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence

  }
}