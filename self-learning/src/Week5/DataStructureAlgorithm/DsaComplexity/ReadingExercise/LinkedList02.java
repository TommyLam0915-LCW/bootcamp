package Week5.DataStructureAlgorithm.DsaComplexity.ReadingExercise;

public class LinkedList02 {
    Node head; // head of list

    // Linked list Node
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Appends a new node at the end.
    public void append(int new_data) {
        // 1. Allocate the Node &
        // 2. Put in the data
        // 3. Set next as null
        Node new_node = new Node(new_data);

        // 4. If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = new_node;
            return;
        }
        // 5. Else traverse till the last node
        Node last = head;
        while (last.next != null)
            last = last.next;

        // 6. Change the next of last node
        last.next = new_node;
    }

    // This function prints contents of linked list starting from the given node
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        // Start with the empty list
        LinkedList02 llist = new LinkedList02();
        // Insert 6. So linked list becomes 6 -> NULL
        llist.append(6);

        // Insert 4 at the end. So linked list becomes
        // 6 -> 4 -> NULL
        llist.append(4);

        System.out.println("Created Linked list is: ");
        llist.printList();
    }
}

