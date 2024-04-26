import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.remove("hello");
        strings.add("def");

        // Converting LinkedList to Queue is not necessary, but if needed, cast it to LinkedList
        LinkedList<String> strings2 = (LinkedList<String>) strings;

        strings2.add("abc");
        System.out.println(strings2.size()); // 2

        System.out.println(strings2.poll()); // def
        System.out.println(strings2); // [abc]
        System.out.println(strings2.poll()); // abc
        System.out.println(strings2.poll()); // null

        strings2.add("xyz");
        strings2.add("ijk");
        System.out.println(strings2.peek()); // xyz

        // Using a while loop to remove and read objects
        while (!strings2.isEmpty()) {
            System.out.println(strings2.poll());
        }
        System.out.println(strings2.size()); // 0

        // Adding elements to the Queue
        strings2.add("Vincent");
        strings2.add("Oscar");

        Queue<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(101);
        integers.add(2);
        integers.add(99);
        integers.add(-8);

        // Removing odd numbers from the Queue
        Queue<Integer> integers2 = integers; // backup?
        int size = integers.size();
        int val = -1;
        while (size-- > 0) {
            val = integers.poll();
            if (val % 2 == 1)
                integers.add(val);
        }
        System.out.println(integers); // [1, 101, 99]
        System.out.println(integers2.size()); // 3

        System.out.println(integers2.remove()); // 1, what is the difference between remove() and poll()?
        System.out.println(integers); // [101, 99]
        System.out.println(integers.remove()); // 101
        System.out.println(integers.remove()); // 99
        System.out.println(integers.size()); // 0
        // System.out.println(integers.remove()); //

        integers.add(2000);
        integers.add(1000);
        System.out.println(integers.remove(1000)); // true
        System.out.println(integers.remove(1500)); // false, because Integer.class has override equals()

        String x = "hello";
        String x2 = x;
        x = x + "world"; // x object (new object), because String is immutable
        System.out.println(x2); // hello

        int[] arr = new int[] {2, 1, 3};
        int[] backup = Arrays.copyOf(arr, arr.length); // copyof() -> create another array
        arr[1] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(backup));
    }
}
