package Week5.DataStructure.ArrayDeque;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeExample {
  public static void main(String[] args) {
    // Create an ArrayDeque of Integers
    ArrayDeque<Integer> deque = new ArrayDeque<>();

    // Adding elements to the front and back of the deque
    // addFirst(E element) or offerFirst(E element): Adds the specified element to the front of the deque.
    deque.addFirst(10);
    deque.addFirst(20);
    deque.addFirst(30);
    deque.offerFirst(40); // [40, 30, 20, 10]

    // removeFirst() : Retrieves and removes the first element of the deque.
    int firstElement = deque.removeFirst(); // 40

    // removeLast() : Retrieves and removes the last element of the deque.
    int lastElement = deque.removeLast(); // 10

    // pollFirst() : Retrives and removes the first element of the deque, or returns null if the deque is empty
    Integer firstElement02 = deque.pollFirst(); // 30 

    // pollLast() : Retrives and removes the last element of the deque, or returns null if the deque is empty
    Integer lastElement02 = deque.pollFirst(); // 20

    deque.addFirst(10);
    deque.addFirst(20);
    deque.addFirst(30);
    deque.offerFirst(40);

    // getFirst(): Retrieves the first element of the deque without removing it.
    int firstElement03 = deque.getFirst(); // 40 

    //getLast() : Retrieves the last element of the deque without removing it.
    int lastElement03 = deque.getLast(); // 10

    // peekFirst(): Retrieves the first element of the deque without removing it, or return null if the deque is empty.
    Integer firstInteger = deque.peekFirst(); // 40

    //peekLast(): Retrieves the last element of the deque without removing it, or return null if the deque is empty.
    Integer lasInteger = deque.peekLast(); // 10 

    //removeFirstOccurence(Object obj): Removes the first occurence of the specified element from the deque, if it exists 
    deque.removeLastOccurrence(20);
  
    System.out.println(deque);
    System.out.println(firstElement);
    System.out.println(lastElement);
    System.out.println(firstElement02);
    System.out.println(lastElement02);
    System.out.println(firstElement03);
    System.out.println(lastElement03);
    System.out.println(firstInteger);
    System.out.println(lasInteger);

    
  }
}
