package src;

public class ABCException extends RuntimeException {
  // "extends RuntimeException" implies "ABCException" is a run-time exception
  // complier would not check if you have handled teh exception

  public static void main(String[] args) {
    checkName("Vincent Vincent", "Lau");
  }
  
  public static String checkName(String firstName, String lastName) throws ABCException {
    if (firstName == null || lastName == null)
      throw new IllegalArgumentException();
    if (firstName.length() + lastName.length() > 100)
      throw new ABCException();
    return firstName.concat(" ").concat(lastName);
  }
}
