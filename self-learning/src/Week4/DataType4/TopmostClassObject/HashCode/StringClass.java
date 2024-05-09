package Week4.DataType4.TopmostClassObject.HashCode;

public class StringClass {

  // Source Code - StringLatin1.class
  public static int hashCode(byte[] value) {
    int h = 0;
    for (byte v : value) {
      h = 31 * h + (v & 0xff);
    }
    return h;
  }

  public static void main(String[] args) {
    String str = "ABC";

    System.out.println(str.hashCode());
    System.out.println(65 * (int) Math.pow(31, 2) + 66 * 31 + 67);

    // A * 31 ^2 + B*31 +C (as ASCII value of A =65 and B =66 and C =67)
    // = 65 * Math.pow(31,2) + 66 * 31 + 67
    // = 64578
  }


}
