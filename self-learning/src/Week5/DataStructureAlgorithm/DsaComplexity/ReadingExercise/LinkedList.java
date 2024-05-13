package Week5.DataStructureAlgorithm.DsaComplexity.ReadingExercise;

// Demonstrate deletion in singly linked list
public class LinkedList {
  Node head; // head of list

  /*
   * Given a key, deletes the first occurrence of key in linked list
   */

  void deleteNode(int key) { // delete by node value
    // Store head node
    Node temp = head;
    Node prev = null;

    // If head node itself holds they key to be deleted
    if (temp != null && temp.data == key) {
      head = temp.getNext(); // Changed head
      return;
    }
    // Search for the key to be deleted, keep track of
    // the previous node as we need to change temp.next
    while (temp != null && temp.data != key) {
      prev = temp;
      temp = temp.getNext();
    }
    // If key was not present in linked list
    if (temp == null)
      return;

    // Unlink the node from linked list 
    prev.setNext(temp.getNext());
  }

  // Insert a new Node at front of the list
  public void push(int new_data) // insert to tail by node data
  {
    Node new_node = new Node(new_data);
    new_node.setNext(head);
    this.head = new_node;
  }
  // This function prints contents of linked list starting from the given node 
  public void printlist()
  {
    Node tnode = head;
    while(tnode != null){
      System.out.println(tnode.data + " ");
      tnode = tnode.getNext();
    }
  }

  // Driver program to test above functions
  public static void main(String[] args) {
    LinkedList llist = new LinkedList();

    llist.push(7);
    llist.push(1);
    llist.push(3);
    llist.push(2);

    System.out.println("\nCreated Linked list is: ");
    llist.printlist(); // 2,3,1,7

    llist.deleteNode(1); // Delete node with data 1 


    System.out.println("\\nLinked List after Deletion of 1:");
    llist.printlist(); //2,3,7

  }
}
