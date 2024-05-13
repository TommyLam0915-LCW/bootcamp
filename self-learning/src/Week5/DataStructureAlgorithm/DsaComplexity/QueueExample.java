package Week5.DataStructureAlgorithm.DsaComplexity;


// A queue is a data structure that follows FIFO (First-In-First-Out)
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    // Adds elements {0,1,2,3,4} to the queue
    for (int i =0; i<5; i++){
      q.add(i);
    }
    // Display contents of the queue.
    System.out.println("Elements of queue " + q); // Elements of queue [0, 1, 2, 3, 4]

    // To remove the head of queue.
    int removedElement = q.remove();
    System.out.println("removed element is " + removedElement); // removed element - 0
    // queue after removal
    System.out.println(q); // [1, 2, 3, 4]

    // Return the head of queue 
    int head = q.peek();
    System.err.println("head of queue is " + head); // head of queue is 1

    // To remove head of queue and return it 
    System.out.println("removed head of queue is " + q.poll());
    // queue after removal 
    System.out.println(q); // removed element is 1

    // Rest all methods of collection interface like size and contains
    // can be used with this implementation 
    int size = q.size();
    System.out.println("Size of queue is " + size); // size of queue is 3
  }
}
