import java.util.Optional;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Customer {
  private Optional<String> name;

  private Optional<String> getName() { // getName() well-known method, getter/ setter should not return Optional<T>
    return this.name;
  }

  // deserialization / serialization
  // {
  // "name" : "John"
  // }

  // Java Object <-> JSON (deserialization / serialization)
  // Optional<T> cannot be supported by deserialization / serialization

  public static void main(String[] args) {
    // sum(null, Optional.of(Double.valueOf(3.0))); // NPE

    Optional<String> result = null;
    result = Optional.of("hello");
    result = Optional.empty(); // Optional object will null value

    String str = "hello";
    int x = 10;
    if (x >= 10)
      str = null;
    result = Optional.ofNullable(str); // can store null or non-null object
    // Optional.of(null); //NPE

    List<String> names = new ArrayList<>(List.of("Vincent", "Jenny", "Oscar"));
    // Stream
    List<Optional<String>> result2 = names.stream() //
        // .map(e -> Optional.ofNullable(e)) //
        .map(Optional::ofNullable) // method reference
        .collect(Collectors.toList());
    System.out.println(result2);
  }

  public static Double sum(Optional<Double> d1, Optional<Double> d2) {
    if (d1 != null && d2 != null && d1.isPresent() && d2.isPresent()) { // dummy code?!
      return d1.get().doubleValue() + d2.get().doubleValue();
    }
    throw new IllegalArgumentException();
  }
}
