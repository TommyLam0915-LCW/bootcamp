import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        // // 9 types = Primitives + String
        // int x = 2;
        // String s = "abc";

        int x = 2;
        String s = "abc";


        // // Array (Store a set of same type of values)
        // int[] arr = new int[3];
        int[] arr = new int[3];
        // // Assign the value to the int array
        // arr[0] = 100;
        // arr[1] = 2;
        // arr[2] = -20000;
        // arr[3] = 100;
        // arr[-1] = 100;
        // System.out.println(arr[0]); // 100
        // System.out.println(arr[1]); // 2
        // System.out.println(arr[2]); // -20000
        // // Create another int array to the orginal variable
        // arr = new int[4];
        arr = new int[4];
        // System.out.println(arr[0]); // 0
        // System.out.println(arr[1]); // 0
        // System.out.println(arr[2]); // 0

        // arr[0] += 10;// 10
        // arr[0] *= 2; // 10
        // System.out.println(arr[0]); // 20

        // long[] arr2 = new long[10];

        // String[] strings = new String[3]; // String array object
        // strings[0] = "abc";
        // strings[1] = "hello";
        // strings[2] = "xyz";
        // // resize

        // // strings[0] -> an address pointing to a String object
        // strings[0] += "def";
        // System.out.println(strings[0]); // "abcdef"

        // strings[1] = strings[2];
        // System.out.println(strings[1]);

        // String[] backup = strings;

        // strings = new String[4];
        // strings[1] = "mvn";
        // System.out.println(strings[0]); // null
        // System.out.println(strings[1]); // null
        // System.out.println(strings[2]); // null

        // if ("abcdef".equals(strings[0])) {
        // System.out.println(strings[0]);
        // }

        // int[] integers = new int[10];
        // // default
        // System.out.println(integers[0]); // 0

        // // default value of double is 0.0
        // // default value of boolean is false
        // // default value of char is "\u00000"

        // char c3 = 'a'; // 97
        // System.out.println(c3);
        // System.out.println(c3 > 97); // false
        // System.out.println(c3 > 96); // true

        // if (c3 == 97) {
        // System.out.println("c3 is 97 in ASCII");
        // }

        // if (c3 == 'a') {
        // System.out.println("c3 is char a");
        // }

        // if (c3 >= 'a') {
        // System.out.println("c3 >= 97");
        // }

        // long l = 2200000000000000000L;
        // // int x2 = l; //compile time error
        // int x2 = (int) l; // "()" You pick the risk.
        // System.out.println("x2=" + x2); // -2094967296

        // short s2 = 128;
        // byte b = (byte) s2;
        // System.out.println("b=" + b); // -128 (risk: overflow)

        // // The ways to declare and assign String value
        // String s3 = "abc"; // "abc" is a string object in heap
        // String s4 = new String("abc"); // this "abc" is another string object in heap
        // String s5 = "abc"; // this "abc" object is same as the one in s3
        // String s6 = new String("abc"); // this "abc" is another new String object

        //
        // String[] strings2 = new String[3];
        // strings2[0] = "hello";
        // strings2[1] = "hello";
        // strings2[2] = "hello";
        // String[] string3 = new String[] {"hello", "hello", "hello"}; // imply the length = 3
        // String[] strings4 = {"hello", "hello", "hello"}; // imply you have to assign an string array object

        // for (int i = 0; i < strings2.length; i++) { // 0,1,2
        // // System.out.println(strings2[i]);
        // }
        // // Example
        // int[] integers2 = new int[] {1, 2, 3, 4, 5, 6, 7};
        // // loop: print odd numbers

        // for (int i = 0; i < integers2.length; i++) {
        // if (integers2[i] % 2 != 0) {
        // // System.out.println(integers2[i]);
        // }
        // }
        // int sum = 0;
        // int count = 0;
        // // average value of the even number
        // for (int i = 0; i < integers2.length; i++) { //10000
        // if (integers2[i] % 2 == 0) {
        // sum += integers2[i];
        // count++;
        // }
        // }
        // System.out.println("The Average is " + sum / count);
        // // Find the max value within the int array
        // int max = Integer.MIN_VALUE; // the min.value of int
        // for (int i = 0; i < integers2.length; i++) {
        // if (max < integers2[i]) {
        // max = integers2[i];
        // }
        // }
        // System.out.println("max : " + max); // 7

        // int min = Integer.MAX_VALUE;
        // for (int i = 0; i < integers2.length; i++) { // 1,2,3,4,5,6,7
        // if (min > integers2[i]) {
        // min = integers2[i];
        // }
        // }
        // System.out.println("min : " + min); // 1

        // // Searching
        // char[] characters = new char[] {'a', 'b', 'e', '!'};
        // // check if the array contains char '!' ->
        // boolean result = false;
        // for (int i = 0; i < characters.length; i++) {
        // if (characters[i] == '!') {
        // result = true;
        // break;
        // }
        // }
        // System.out.println(result);

        // //print out index of "i", if not found, print -1
        // int index = -1;
        // for (int i = 0; i < characters.length; i++) {
        // if (characters[i] == '!') {
        // index = i;
        // break;
        // }
        // }
        // System.out.println(result ? index : -1);

        // //Store all index of '!'' in another array

        // char[] characters2 = new char[] {'a', 'b', '!', 'e','!'};
        // int[] indexes = new int[characters2.length];
        // int j =0;
        // for (int i =0; i< characters2.length; i++){
        // if (characters2[i]=='!'){ //condition
        // indexes[j] = i;
        // j++;
        // }
        // }
        // System.out.println(Arrays.toString(indexes));
        // //[2,4,0,0,0]

        // //
        // String[] balls = new String []{"RED", "YELLOW","BLACK","YELLOW"};
        // double[] prices = new double []{5.5,7.8,10.0,7.8};
        // double[] quantities = new double[] {1,3,4,5};
        // //YELLOW balls (price* quantities)

        // double amount=0;
        // for (int i =0; i<balls.length; i++){
        // if ("YELLOW".equals(balls[i])) {
        // amount += prices[i] * quantities[i]; //double value * int value -> double value
        // }
        // }
        // System.out.println(amount); //62.4
    }
}

