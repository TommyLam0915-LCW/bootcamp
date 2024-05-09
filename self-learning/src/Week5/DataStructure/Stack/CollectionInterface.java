package Week5.DataStructure.Stack;

import java.util.Stack;

// Methods in Collection Interface

public class CollectionInterface {
  public static void main(String[] args) {
    // add (E element): Adds the specified element to the collection
    Stack<Integer> stack = new Stack<>();
    stack.add(10);
    // (equivalent to push() in stack)
    stack.push(10);
    // remove(Object obj): Removes the first occurrence of the specified elements from the collection
    stack.remove(Integer.valueOf(10));
    System.out.println(stack); // Remove the element 10 from the stack

    // addAll(Collection<? extends E> c): Adds all elements from the specified collection to the collection.
    Stack<Integer> otherStack = new Stack<>();
    otherStack.add(20);
    otherStack.add(30);
    stack.addAll(otherStack); // [10,20,30] // Adds all elements from otherStack to stack

    // clear(): Removes all elements from the collection
    stack.add(20);
    stack.add(10);
    stack.clear(); // [] // Removes all elements from the stack

    // contains(Object obj): Returns true if the collection contains the specified element.
    boolean contains = stack.contains(10); // false

    // isEmpty: Returns true if the collection is empty
    boolean isEmpty = stack.isEmpty(); // false

    //size(): Returns the number of element in the collection
    int size = stack.size(); // size is 0;

    System.out.println(otherStack);
    System.out.println(stack);
    System.out.println(contains);
    System.out.println(isEmpty);
    System.out.println(size);
  }
}
