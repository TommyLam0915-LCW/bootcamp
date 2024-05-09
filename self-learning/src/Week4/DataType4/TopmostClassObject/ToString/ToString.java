package Week4.DataType4.TopmostClassObject.ToString;

import Week3.InstanceVariableAndConstructor.Student;

public class ToString {
  // Default behavior of toString() is to print class name,then
  // @, then unsigned hexadecimal representation of the hash code
  // of the object

  public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }

  // Note 1 : Whenever we try to print any Object Reference
  // then internally the toString() method is called
  public static void main(String[] args) {
    Student s = new Student();

    // Below two statements are equivalent
    System.out.println(s); // toString() is called internally, String representation of hashc code
    System.out.println(s.toString()); // String representation of hashc code
  }
}
