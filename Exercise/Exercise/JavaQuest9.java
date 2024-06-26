package Exercise;

/**
 * Expected Output: J e 3 9 10 ab c VenturenixLAB, Coding 19 ren VENTURENIXLAB, JAVA venturenixlab, java V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";
    // prints J
    // prints e (the 1st e)
    // code here ..
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'J') {
        System.out.println(str.charAt(i));
      }
    }

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        System.out.println(str.charAt(i));
        break;
      }
    }


    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...

    int index = str.indexOf('t');
    int index02 = str.indexOf('x');
    int index03 = str.indexOf('L');

    System.out.println(index);
    System.out.println(index02);
    System.out.println(index03);

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    String trimmedabc = abc.trim();
    System.out.println(trimmedabc);
    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
    String replacedABC= abc.replace(abc, "VenturenixLAB, Coding");
    System.out.println(replacedABC);

    // int length()
    // prints 19
    // code here ...
    int lengthABC = replacedABC.length();
    System.out.println(lengthABC);
    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    String subReplacedABC = replacedABC.substring(5,8);
    System.out.println(subReplacedABC);
    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    String lowercase = replacedABC.toLowerCase();
    String uppercase = replacedABC.toUpperCase();

    System.out.println(uppercase);
    System.out.println(lowercase);
    
    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println(replacedABC.replace("e","*").replace("Coding","java").concat("!!!").toUpperCase());

  }
}
