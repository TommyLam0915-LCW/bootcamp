
// Java; compile language;
// java file (HelloWorld.java) -> Compilation (javac) -> class file (byte code -0)

// "String" is a keyword in Java.

public class String1 {
  public static void main(String[] args) {
    int x = 0;
    char c2 = 's';

    String y = "Hello World!"; // H e l l o W o r l d
    String z = "123";
    // int sum = x + s;

    String s3 = ""; // empty string
    String s4 = " "; // space

    // Tool for String
    // length()
    int length0fY = y.length();
    // charAt()
    char character = y.charAt(2);

    System.out.println(length0fY); // 12
    System.out.println(character); // l
    // System.out.println(y.charAt(100)); // runtime error

    // equals()
    String s1 = "hello";
    String s2 = "hello";

    boolean isS1EqualsToS2 = s1.equals(s2);
    System.out.println(isS1EqualsToS2); // true

    //concat 
    String s5 = s1+s2;
    System.out.println(s5); //hellohello
    System.out.println(s1+s2); //hellohello

    // - ,*, are not allow for String
    System.out.println(s5+10); //String + int -> String + String
    System.out.println(s5+'a');//String + char -> String + String
    System.out.println(s5+10.3);
    System.out.println(s5+true);// hellohellotrue

    String j = "hello"+ true;
    //String j2 = 10+10; // int +int = int

    String s7 = "world";
    s7 += "!";
    System.out.println(s7); //world! 
  }
}
