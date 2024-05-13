package Week5.DataStructure.LinkedList;

import java.util.LinkedList;

public class DequeInterface {
  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<>();

    // addFirst(E element): Insert the specified element at the begining of the deque.
    names.add("Alice");
    names.addFirst("Bob"); // Insert "Bob" at the beginning of the deque

    // addLast(E element): Insert the specified element at the end of the deque.
    names.add("Alice");
    names.addLast("Bob"); // Insert "Bob" at the end of the deque

    // reomveFirst(): Reomves and returns the first element of the deque.
    names.add("Alice");
    String firstElement = names.removeFirst(); // Removes and returns "Bob"

    // reomveLast(): Reomves and returns the last element of the deque.
    String lastElement = names.removeLast(); // Removes and returns "Alice"

    // getFirst(): Retrives the first element of the deque without removing it.
    String firstname02 = names.getFirst(); // Retrieves "Alice"

    // getLast(): Retrives the last element of the deque without removing it.
    String lastName02 = names.getLast();

    // offerFirst(E element): Inserts the specified element at the begining of the deque and returns true if sucessful.
    boolean success = names.offerFirst("Bob"); // Insert "Bob" at the beginning and returns true

    // offerLast(E element): Inserts the specified element at the end of the deque and returns true if successful.
    boolean success02 = names.offerLast("Bob");// Insert "Bob" at the end and returns true

    //peekFirst(): Retrieves the first element of the deque without removing it, 
    // returns null if the deque is empty.
    String firstElement03 = names.peekFirst(); // Retrieves "Bob"

    //peekLast(): Retrieves the last element of the deque without removing it, 
    // returns null if the deque is empty.
    String lastElement03 = names.peekLast(); // Retrieves "Alice"


    System.out.println(names);
    System.out.println(firstElement);
    System.out.println(lastElement);
    System.out.println(firstname02);
    System.out.println(lastName02);
    System.out.println(success);
    System.out.println(success02);
    System.out.println(firstElement03);
  }

}
