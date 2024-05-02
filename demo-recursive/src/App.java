package src;

public class App {
    public static void main(String[] args) throws Exception {

        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result *= i;
        }
        System.out.println(result); // Print factorial calculated using loop

        System.out.println(multiply(5)); // Print factorial calculated using recursion

        // 2 + 4 + 6 + 8 + 10 ...+ 98 + 100
        int result01 = addEven(100); // Call addEven method to get the sum of even numbers
        System.out.println(result01);

        // fibonacci sequence: 0,1,1,2,3,5,8,13,21,34,55,89,144
        // n = 1 -> 0
        // n = 4 -> 2
        // n = 7 -> 8
        int n1 = 1; // Position in the Fibonacci sequence
        int n2 = 4;
        int n3 = 7;

        // Calculate and print Fibonacci numbers for positions n1, n2, n3
        System.out.println("Fibonacci number at position " + n1 + ": " + fibonacci(n1));
        System.out.println("Fibonacci number at position " + n2 + ": " + fibonacci(n2));
        System.out.println("Fibonacci number at position " + n3 + ": " + fibonacci(n3));
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int addEven(int n) {
        if (n <= 2)
            return n;
        // If n is odd, make it even by subtracting 1
        if (n % 2 != 0) {
            n--;
        }
        return n + addEven(n - 2); // Recursively add even numbers from n to 2
    }

    public static int multiply(int n) {
        // base case (exit criteria)
        if (n <= 1)
            return n;
        return n * multiply(n - 1);
        // 5 * (5-1) -> waiting 1 release 4 (when we put (5-1) to multiply(), we are waiting an int value returned )
        // 4* (4-1) -> waiting 2 release 3
        // 3* (3-1) -> waiting 3 release 2
        // 2* (2-1) -> waiting 4 release 1
        // 1 -> return 1
    }
}
  


