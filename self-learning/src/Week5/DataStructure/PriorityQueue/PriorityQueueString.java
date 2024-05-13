package Week5.DataStructure.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueString {
  public static void main(String[] args) {
    PriorityQueue<String> priorityQueue = new PriorityQueue<>();

    //Adding string with natural ordering 
    priorityQueue.add("banana");
    priorityQueue.add("apple");
    priorityQueue.add("orange");

    //Removing string based on natural ordering 
    System.out.println(priorityQueue.poll()); // output: apple
    // Adding "apple" again and observing the order 
    priorityQueue.add("apple");
    System.out.println(priorityQueue.poll()); // Output: apple
    System.out.println(priorityQueue.poll()); // Output: banana
    System.out.println(priorityQueue.poll()); // Output: orange 
  }
}
