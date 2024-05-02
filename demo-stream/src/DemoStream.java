import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class DemoStream {
        public static void main(String[] args) throws Exception {
                List<Integer> integers = new LinkedList<>();
                integers.add(21);
                integers.add(44);
                integers.add(100);
                integers.add(101);

                // List of odd number
                List<Integer> odds = new ArrayList<>();
                for (int num : integers) {
                        if (num % 2 != 0) {
                                odds.add(num);
                        }
                }
                System.out.println(odds);

                // Stream
                List<Integer> result = integers.stream() // List<Integer> -> Stream<Integer>
                                .filter(e -> e % 2 == 1) // // Stream<Integer>
                                .collect(Collectors.toList()); // List(Integer) (new)
                System.out.println(result); // [21, 101]

                List<Integer> result2 = integers.stream() //
                                .filter(e -> e % 2 == 1) //
                                .filter(e -> e > 100) //
                                .collect(Collectors.toList()); //
                System.out.println(result2); // [101]

                List<Integer> result3 = integers.stream() //
                                .filter(e -> e % 2 == 1 && e > 100) //
                                .collect(Collectors.toList()); //
                System.out.println(result3); // [101]

                List<Integer> integers2 =
                                new LinkedList<>(List.of(101, 101, 203, 200));
                // remove duplicated -> set
                List<Integer> result4 = integers2.stream() //
                                .distinct() //
                                .collect(Collectors.toList());
                System.out.println(result4); // [101, 203, 200]

                // counting
                long size = integers2.stream() //
                                .filter(e -> e < 200).distinct() //
                                .count();
                System.out.println(size); // 1

                //
                List<Customer> customers = new LinkedList<>(
                                List.of(new Customer(13, "Jenny"),
                                                new Customer(18, "Vincent")));

                List<Customer> adultCustomers = customers.stream() // -> new Stream<Customer>
                                .filter(e -> e.getAge() >= 18) //
                                .collect(Collectors.toList()); // -> new ArrayList() -> new Customer Vincent
                System.out.println(adultCustomers);

                System.out.println(customers);
                System.out.println(adultCustomers);

                customers.get(1).setAge(19);

                System.out.println(customers);
                System.out.println(adultCustomers);


                String[] strings = {"abc", "Akjf", "a", "bcd", "aaa"};

                // Convert array to list
                Arrays.asList(strings);

                // Filter strings starting with 'a'
                List<String> startWitha = Arrays.asList(strings).stream()
                                .filter(e -> e.startsWith("a"))
                                .collect(Collectors.toList());

                System.out.println(startWitha);

                // list -> array
                stringList.toArray(strings);
        }


        public static List<Integer> getOdds(List<Integer> integers) {
                return integers.stream() //
                                .filter(e -> e % 2 == 1) //
                                .collect(Collectors.toList());
        }
}
