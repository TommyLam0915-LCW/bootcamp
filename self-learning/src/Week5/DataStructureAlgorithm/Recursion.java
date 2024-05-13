package Week5.DataStructureAlgorithm;

public class Recursion {
  // What is Recursion
  // -> The process in which a function calls itself directly or indirectly is called recursion
  // and the corresponding function is called as recursive function

  // Best condition in recursion
  // -> In the recursive program, the solution to the base case is provided and the solution to the bigger problem is expressed in term of smaller problems.

  // Traditional way by for loop
  int factorial(int n) {
    int i, fact = 1;
    // 1*2*3, where n = 3
    // 1*2*3*4*5, where n = 5
    for (i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }

  // Recursive way
  int factorial02(int n) {
    if (n <= 1) { // base case
      return 1;
    }
    return n * factorial02(n - 1);
    // return 5 * (4*(3*(2*(1))))
  }

  public static void main(String[] args) {
    Recursion factorial = new Recursion();
    Recursion factorial02 = new Recursion();
    int number = 5;
    int result = factorial.factorial(number);
    int result02 = factorial02.factorial02(number);
    System.out.println("Factorial of " + number + " is: " + result);
    System.out.println("Factorial of " + number + " is: " + result02);
  }
}
