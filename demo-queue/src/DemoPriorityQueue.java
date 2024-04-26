import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    Queue<Integer> integers = new PriorityQueue<>();
    integers.add(1999); 
    integers.add(5);
    integers.add(-2);
    System.out.println(integers.poll()); //-2, sorting
    System.out.println(integers.poll()); //5, sorting
    System.out.println(integers.poll()); //12, sorting
    System.out.println(integers); // [1999]

    System.out.println(integers.poll());

    Queue<Integer> integers2 = new PriorityQueue<>(new SortByDescending());
    integers2.add(20);
    integers2.add(10);
    integers2.add(21);
    integers2.add(34);

    System.out.println(integers2);
    System.out.println(integers2.poll());
    System.out.println(integers2.poll());

    
  }
}
