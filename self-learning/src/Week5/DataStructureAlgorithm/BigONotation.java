package Week5.DataStructureAlgorithm;

import java.util.Arrays;

public class BigONotation {
  // 1. What is Algorithm?
  // -> An algorithm is a finite sequence of well-definfed computer-implementable
  // instructions, typically to solve a class of problem or to perfrom a computation.

  // Complexity Analysis
  // -> The process of determing how efficient an algorithm is.
  // -> Complexity analysis usally involves finding both the time complexity and the space complexity of an algorithum.
  // -> Both types of complexity describle how na algorithum perform as its input size incerase.

  // Time Complexity
  // -> A measure of how fast an algorithm runs, time complexity is a central concept in the field of algorithms.
  // -> It is expressed using the Big-o notation.

  // Space Complexity
  // -> A measure of how much auxiliary memory that an algorithm takes up, space complexity is also central concept in the field of algorithms.
  // -> It is expressed using the Big-O notation.

  // Memory
  // -> Memory is a bounded canvas and has a finite numbers of memory lots.
  // -> A computer stores variables and arrays in continuous memory slots.
  // -> The less memory an algorithm takes, the better it perform.


  public static void main(String[] args) {
    // Constant : O(1)
    // Constant time : Even it it takes 3 times as long to run, it doesn't depend on the size of the input,
    // note that O(2),O(3) or even O(10000) would means the same time
    int[] arr = {1, 2, 3, 4, 5};
    int n = 2;
    System.out.println("Hey - your input is: " + n);
    System.out.println("Hmmm.. I'm doing more stuff with: " + n);
    System.out.println("And more: " + n);

    // Logarithmic: O(log(n))
    // Logarithmic time is the next quickest, Unfortunately, they're bit thricker to imagine.
    // The running time grows in proportion to the logarithm of the input

    // When n grow from 8 to 32, the running time just grow from 3 to 5.
    // where log base 2 (8)v= 3 , log base 2 (32) = 5


    int a = 8;
    for (int i = 1; i < a; i = i * 2) {
      System.out.println("Hey - I'm busy looking at: " + i);
    }

    // if n = 8, the output will be the following:
    // Hey - I'm busy looking at: 1
    // Hey - I'm busy looking at: 2
    // Hey - I'm busy looking at: 4

    int b = 32;
    for (int i = 1; i < b; i = i * 2) {
      System.out.println("Hey - I'm busy looking at: " + i);
    }
    // if b = 32, the output will be the following:
    // Hey - I'm busy looking at: 1
    // Hey - I'm busy looking at: 2
    // Hey - I'm busy looking at: 4
    // Hey - I'm busy looking at: 8
    // Hey - I'm busy looking at: 16

    // Linear : O(n)
    // -> The simple algorithm presented below will grow linear with the size of its input.
    int c = 2;
    for (int i = 0; i < c; i++) {
      System.out.println("Hey - I'm looking at: " + i);
    }

    int d = 4;
    for (int i = 0; i < d; i++) {
      System.out.println("Hey - I'm looking at: " + i);
    }
    /*
     * When c =2; Hey - I'm looking at: 0 Hey - I'm looking at: 1
     * 
     * When d =4, Hey - I'm looking at: 0 Hey - I'm looking at: 1 Hey - I'm looking at: 2 Hey - I'm looking at: 3
     */

    // Example 2, O(2n) -> O(n) -> Linear
    // We don't care about the coefficients, still linear
    int e = 4;
    for (int i = 0; i < e; i++) {
      System.out.println("Hey - I'm busy looking at: " + i);
      System.out.println("Hmmm.. Let's have another look at: " + i);
      System.out.println("And another: " + i);
    }

    // Log-linear: O(nlog(n))
    // n log n is the next slower of algorithms , slower that O(n) algorithms
    // 0(8 * log(8))
    int f = 8;
    for (int i = 1; i <= f; i++) { // n = 8
      for (int j = 1; j < f; j = j * 2) { // log base 2 (8)
        System.out.println("Hey I'm busy looking at: " + i + " and " + j);

        /*
         * If the n is 8, then this algorithm will run 8 * log base2 (8)= 8*3 = 24 times Hey I'm busy looking at: 1 and 1 Hey I'm busy looking at: 1 and 2 Hey I'm busy looking at: 1 and 4 H ey I'm busy
         * looking at: 2 and 1 Hey I'm busy looking at: 2 and 2 Hey I'm busy looking at: 2 and 4 Hey I'm busy looking at: 8 and 1 Hey I'm busy looking at: 8 and 2 Hey I'm busy looking at: 8 and 4
         */

      }
    }
    // Quadratic : O(n ^2)
    // Slower than n log n algorithms
    // The important message here is, O(n(2)) is faster than o(n(3)) which is faster than o(n(4)), etc

    // O(n^2), when n =3, this algorithm will run 3^2 = 9 times.
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.println("Hey - I'm busy looking at: " + i + "and" + j);
        // Hey - I'm busy looking at: 1and1
        // Hey - I'm busy looking at: 1and2
        // Hey - I'm busy looking at: 2and1
        // Hey - I'm busy looking at: 2and2
      }
    }
    // One more nested loop
    // O(n^3), when n =3, this algorithm will run 3^3 = 27 times.
    int g = 3;
    for (int i = 1; i <= g; i++) {
      for (int j = 1; j <= g; j++) {
        for (int k = 1; k < +g; k++) {
          System.out.println(
              "Hey - I'm busy looking at: " + i + " and " + j + " and " + k);
          // Hey - I'm busy looking at: 1 and 1 and 1
          // Hey - I'm busy looking at: 1 and 1 and 2
          // Hey - I'm busy looking at: 1 and 2 and 1
          // Hey - I'm busy looking at: 1 and 2 and 2
          // Hey - I'm busy looking at: 1 and 3 and 1
          // Hey - I'm busy looking at: 1 and 3 and 2
          // Hey - I'm busy looking at: 2 and 1 and 1
          // Hey - I'm busy looking at: 2 and 1 and 2
          // Hey - I'm busy looking at: 2 and 2 and 1
          // Hey - I'm busy looking at: 2 and 2 and 2
          // Hey - I'm busy looking at: 2 and 3 and 1
          // Hey - I'm busy looking at: 2 and 3 and 2
          // Hey - I'm busy looking at: 3 and 1 and 1
          // Hey - I'm busy looking at: 3 and 1 and 2
          // Hey - I'm busy looking at: 3 and 2 and 1
          // Hey - I'm busy looking at: 3 and 2 and 2
          // Hey - I'm busy looking at: 3 and 3 and 1
          // Hey - I'm busy looking at: 3 and 3 and 2
        }
      }
    }
    // Expontentail: O(2^n)
    // O(2^8), when n = 8, this algorithm will run 2^8 = 256 times
    int h = 8;
    for (int i = 1; i <= Math.pow(2, h); i++) {
      System.out.println("Hey - I'm busy looking at: " + i);

      // Hey - I'm busy looking at: 1
      // Hey - I'm busy looking at: 2
      // Hey - I'm busy looking at: 3
      // Hey - I'm busy looking at: 4
      // ...
      // Hey - I'm busy looking at: 253
      // Hey - I'm busy looking at: 254
      // Hey - I'm busy looking at: 255
      // Hey - I'm busy looking at: 256
    }
    // Factorial: O(n!)
    // factorial (n) simply calculates n!
    // If n is 8, this algorithm will run 8! = 8*7*6*5*4*3*2*1 = 40320 times
    int z = 4;
    for (int i = 1; i <= factorial(z); i++) {
      System.out.println("Hey - I'm looking at: " + i);
    }
  }

  public static long factorial(int num) {
    if (num <= 1) {
      return 1; // Corrected base case
    }
    return num * factorial(num - 1);
  }
}
