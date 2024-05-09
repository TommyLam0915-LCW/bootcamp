package Week4.DataType4.Encapsulation.EncapsulatesClassState;

// Example 4 : Encapsulation with Private Helper Methods

public class StringUtil {
  public static String reverseString(String input) {
    return reverseStringHelper(input, input.length() - 1);
  }

  private static String reverseStringHelper(String input, int index) {
    if (index < 0) {
      return "";
    }
    return input.charAt(index) + reverseStringHelper(input, index - 1);
  }
}
