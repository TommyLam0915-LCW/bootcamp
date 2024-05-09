package Week5.DataStructure.Stack;

import java.util.Stack;

// Methods in Vector Class

public class StackExample {
  public static void main(String[] args) {
    // Create a Stack of Integers
    Stack<Integer> stack = new Stack<>();

    // Adding elements to the stack
    // add(E element): Adds the specified element to the end of the stack
    stack.push(10);
    stack.push(20);
    stack.push(30);

    // addElement(E obj): Adds the specified object to the end of the stack(equivalent to add()).
    stack.addElement(10);

    // get(int index): Returns the elements at the specified index in the stack.
    int element = stack.get(1); // 20 // Retrieves the elements at index 1 (20)

    // set(int index, E element): Replace the element at the specified index with the given element
    stack.push(200);
    stack.push(100);
    stack.set(0, 5); // Replaces 10 with 5 at index 0

    // remove (int index): Removes the element at the specified index from the stack.
    stack.remove(1); // Removes the element at index 1 (20)

    // removeElementAt(int index): Removes the element at the specifed index from the stack (equivalent to remove()).
    stack.removeElementAt(1); // Removes the element at index 1 (20)

    // removeAllElements(): Removes all elements from the stack
    stack.removeAllElements(); // Removes all the elements from the stack

    // firstElement() : Returns the first element (top of the stack) without removing it.
    stack.push(10);
    stack.push(20);
    stack.push(10);

    int topElement = stack.firstElement(); // Retrieves the first element (top) -10

    //lastElement() : Returns the last elenment (bottom of the stack) wiithout removing it.
    int bottomElement = stack.lastElement(); // Retrieves the last element - 10

    //elementAt(int index): Returns the element at the specified index without removing it 
    int elements = stack.elementAt(1); //Retrives the element at index 1 (20)

    //isEmpty() : Returns true if the stack is empty.
    boolean isEmpty = stack.isEmpty(); // false

    //size(): Returns the number of elements in the stack.
    int size = stack.size();  // size is 3

    System.out.println(stack);
    System.out.println(element);
    System.out.println(topElement);
    System.out.println(bottomElement);
    System.out.println(elements);
    System.out.println(isEmpty);
    System.out.println(size);

  }
}
