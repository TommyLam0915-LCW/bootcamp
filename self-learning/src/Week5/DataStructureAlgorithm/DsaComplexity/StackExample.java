package Week5.DataStructureAlgorithm.DsaComplexity;

import java.util.Stack;
import java.util.stream.*;

public class StackExample {
  public static void main(String[] args) {
    // declare a stack object 
    Stack<Integer> stack = new Stack();

    //print initial stack 
    System.out.println("Initial stack: " + stack);

    //isEmpty()
    System.out.println("Is stack Empty? : " + stack.isEmpty());

    //push() operation 
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    // print non-empty stack 
    System.out.println("Stack after push operation: " + stack); // Stack after push operation: [10, 20, 30, 40]
    // pop() operation
    System.out.println("Element popped out: " + stack.pop()); // Element popped out: 40
    System.out.println("Element after Pop Operation: " + stack); // Element after Pop Operation: [10, 20, 30]

    System.out.println("Stack elements using Java 8 forEach:");
    //Get a stream for the stack 
    Stream stream = stack.stream();
    // traverse though each stream object using forEach construct of Java 8
    stream.forEach((element) -> {
      System.out.println(element + " "); // print element  // 10, 20, 30 
    });
  } 
}
