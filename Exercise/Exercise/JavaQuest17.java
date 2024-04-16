package Exercise;

import java.util.Arrays;

/*
 * 
 * Question : Given a positive integer num consisting only of digits 3 and 5. Return the minimum number you can get by changing at most two digit (3 becomes 5, or 5 becomes 3).
 * 
 * Example 1 : Input : num = 3535 Output : 3333
 * 
 * Example 2 : Input: num = 5555 Output: 3355
 */
public class JavaQuest17 {

  public static void main(String[] args) {
    System.out.println(minimum35Number2(3355)); // Output : 3333
    System.out.println(minimum35Number2(5353));// Output : 3333
    System.out.println(minimum35Number2(3535));// Output : 3333
    System.out.println(minimum35Number2(5555));// Output : 3355
    System.out.println(minimum35Number2(3333));// Output : 3333
    System.out.println(minimum35Number2(3353));// Output : 3333
    System.out.println(minimum35Number2(5535));// Output : 3335

  }

  public static int minimum35Number2(int num) {
    char[] convert = String.valueOf(num).toCharArray();
    int count = 0;
    for (int i = 0; i < convert.length; i++) {
      if (convert[i] == '5') {
        count++;
        convert[i] = '3';
      }
      if (count == 2)
        break;
    }
    String ans = "";
    for (char i : convert) {
      ans += i;
    }
    return Integer.valueOf(ans);
  }

  // finish the code
  // Hints : int -> String -> array
  public static int minimum35Number(int num) {
    // code here ...
    String intStr = String.valueOf(num);
    char[] strArr = intStr.toCharArray();
    int count = 2;

    for (int i = 0; i < strArr.length; i++) {
      for (int j = 0; j <= count; j++) {
        if (strArr[i] == '3') {
          strArr[i] = '5';
        } else if (strArr[i] == '5') {
          strArr[i] = '3';
        }
      }
    }
    return Integer.parseInt(String.valueOf(strArr));
  }
}
