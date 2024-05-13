package Week5.DataStructureAlgorithm.DsaComplexity.ReadingExercise;

public class Node {
  int data;
  private Node next; //next is storing the reference of the node

  Node (int d){
    data = d;
    next = null;
  }

  public Node getNext(){
    return this.next;
  }
  public void setNext(Node next){
    this.next = next;
  }
}


