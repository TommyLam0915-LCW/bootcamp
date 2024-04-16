import java.util.Arrays;

public class String1 {


  // Attributes
  private char[] characters;

  // Constructors
  // Empty Constructor (Implicitly exists)
  public String1() {
    this.characters = new char[0];
  }

  public String1(String s) {
    this.characters = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      this.characters[i] = s.charAt(i);
    }
  }

  public void clear() {
    this.characters = new char[0];
  }

  public String concat(String s) {
    char[] newArr = new char[this.characters.length + s.length()];
    int idx = 0;
    for (int i = 0; i < newArr.length; i++) {
      newArr[idx++] = characters[i];
    }
    for (int i = 0; i < s.length(); i++) {
      newArr[idx++] = s.charAt(i);
    }
    return String.valueOf(newArr);
  }

  public void concat2(String s) {
    char[] copyArr = this.characters;
    this.characters = new char[this.characters.length + s.length()];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      this.characters[idx++] = copyArr[i];
    }
    for (int i = 0; i < s.length(); i++) {
      this.characters[idx++] = s.charAt(i);
    }
  }

  // Setter
  // Instance Methods
  public void setValue(String s) {
    this.characters = new char[s.length()];
    // this.characters = s ;
    for (int i = 0; i < s.length(); i++) {
      this.characters[i] = s.charAt(i);
    }
  }

  // Getter
  // Instance Methods
  public String getValue() {
    // return this.characters;
    // this.characters = new char[0];
    String s = "";
    for (int i = 0; i < this.characters.length; i++) {
      // s = s + this.characters[i]; // String + char -> String +String
      s = s.concat(String.valueOf(this.characters[i]));
    }
    return s;
  }

  public String toString() {
    String s = "";
    for (int i = 0; i < this.characters.length; i++) {
      // s = s + this.characters[i]; // String + char -> String +String
      s = s.concat(String.valueOf(this.characters[i]));
    }
    return s;
  }

  public static void main(String[] args) {
    String1 str = new String1(); // constructor

    char[] arr = new char[] {'c', 'd', 'e'};
    // str.setCharacters(arr);
    System.out.println("get=" + str.getValue());
    str.setValue("cde");
    System.out.println("get=" + str.getValue());// char[]

    String1 str2 = new String1("hello");
    System.out.println(str2.getValue()); // str2.toString() // by default call toString -> hello

    String result = str2.concat("world");
    System.out.println(str2);// "hello"
    System.out.println(result); // "helloworld"

    str2.concat2("world");
    System.out.println(str2);// "helloWorld"
    System.out.println(str2.getValue()); // "helloworld"
  }
}
