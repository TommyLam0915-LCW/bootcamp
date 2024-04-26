import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Staff {

  private String name;

  public Staff(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Staff)) {
      return false;
    }
    Staff s = (Staff) obj;

    return Objects.equals(this.name, s.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  @Override
  public String toString() {
    return "Staff(" //
        + "name=" + this.name //
        + ")";
  }

  public static void main(String[] args) {
    // Set is a data structure that ensure no duplicated elements is stored
    HashSet<Staff> staffs = new HashSet<>();

    staffs.add(new Staff("Vincent"));
    staffs.add(new Staff("Oscar"));
    System.out.println(staffs.size());
    System.out.println(staffs.isEmpty());
    System.out.println(staffs);

    // add -> false
    System.out.println(staffs.add(new Staff("Vincent"))); // false
    System.out.println(staffs.size()); // 2

    HashSet<String> strings = new HashSet<>();
    strings.add("hello");
    strings.add("hello");
    System.out.println(strings.size());

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(100);
    integers.add(4);
    integers.add(100);
    integers.add(4);
    integers.add(44);
    System.out.println(integers);

    HashSet<Integer> Integers2 = new HashSet<>();
    for (Integer integer : integers) {
    }
    System.out.println(Integers2);

    Integers2.remove(new Integer(100));
    System.out.println(Integers2);
  }
}
