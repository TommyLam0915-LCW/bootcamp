package Week5.DataStructure.PriorityQueue;

import java.util.Comparator;

import java.util.PriorityQueue;

public class CustomPriorityQueueExample {
  public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueue =
        new PriorityQueue<>(new CustomComparator());

    // Adding elements with custom ordering
    priorityQueue.add(30);
    priorityQueue.add(10);
    priorityQueue.add(50);

    // Removing elements based on custom ordering
    System.out.println(priorityQueue.poll()); // Output: 50
    System.out.println(priorityQueue.poll()); // Output: 30
    System.out.println(priorityQueue.poll()); // output: 10
  }

  static class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
      // Sort in descending order
      return Integer.compare(o2, o1);
    }
  }
}
