import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer2 {

  private String name;
  private ArrayList<Order> orders;

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    ArrayList<Customer2> customers = new ArrayList<>();

    // Searching for a customer named "Vincent"
    for (Customer2 c : customers) {
      if ("Vincent".equals(c.getName())) {
        // Do something if found
      }
    }

    // HashSet example
    HashSet<String> strings = new HashSet<>();
    strings.add("abc"); // true
    strings.add("abc"); // false (already exists)
    System.out.println(strings.size()); // 1

    // Polymorphism example
    List<String> ss = new ArrayList<>();
    ss.add("hello");
    ss.remove(0);
    System.out.println(ss.get(0)); // IndexOutOfBoundsException

    // Set (HashSet) example
    Set<String> ss2 = new HashSet<>();
    ss2.add("hello");
    ss2.remove("hello");
    System.out.println(ss2.size()); // 0

    // Map (HashMap) example
    // You need to import HashMap
    // Map<String, String> stringMap = new HashMap<>();
    // stringMap.put("John", "ABC");
    // System.out.println(stringMap.get("John"));

    // Collection example
    Collection<String> cs = new ArrayList<>();
    cs.add("hello");
    System.out.println(cs.size()); // 1

    // Method invocation examples (test method)
    test("Hello"); // hello
    // test(new HashSet<>(Set.of("World"))); // Uncomment this if test method supports HashSet

    // Checking containment examples
    System.out.println(new ArrayList<>(List.of("Vincent")).contains("Vincent")); // true
    System.out.println(new HashSet<>(Set.of("Vincent")).contains("Vincent")); // true
  }

  // Method to demonstrate polymorphism
  public static void test(String s) {
    System.out.println(s);
  }

  // Method to demonstrate polymorphism
  public static void ascii(Collection<String> cs) {
    if (cs instanceof ArrayList<?>) {
      ArrayList<String> as = (ArrayList<String>) cs;
      System.out.println(as.get(0));
    } else if (cs instanceof HashSet<?>) {
      HashSet<String> hs = (HashSet<String>) cs;
      System.out.println(hs.add("Hello")); // true
      System.out.println(hs.add("Hello")); // false
    }
  }
}

