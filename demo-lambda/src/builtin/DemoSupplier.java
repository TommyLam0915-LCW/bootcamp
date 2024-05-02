package builtin;

import java.util.function.Supplier;
import java.time.LocalDate;
import java.util.Random;

public class DemoSupplier {
  public static void main(String[] args) {
    // T get();
    Supplier<String> hello = () -> "hello";
    System.out.println(hello.get()); // return String

    Supplier<Weekday> monday = () -> Weekday.Monday;
    Weekday monday2 = Weekday.Monday;

    Supplier<LocalDate> now = () -> LocalDate.now();
    System.out.println(now.get()); // LocalDate.now()

    Supplier<Integer> random = () -> new Random().nextInt(10) + 1; // 0-9 + 1 -> 1+10
    System.out.println(random.get());
  }

  public static void printName(Supplier<Weekday> weekday) {
    System.out.println(weekday.get());
  }
}
