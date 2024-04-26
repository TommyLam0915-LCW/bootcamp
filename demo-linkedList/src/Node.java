public class Node {

  private String str; // object reference

  // private Node previos;

  private Node next; // object reference

  // private Node tail;

  public Node(String str) {
    this.str = str;
  }

  public Node(String str, Node next) {
    this.str = str;
    this.next = next;
  }

  public void setNode(Node next) {
    this.next = next;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public Node getNext(){
    return this.next;
  }

  public String getStr(){ // Define getStr() method
    return this.str;
  }

  public static void main(String[] args) {
    // "hello" , "abc", "def"
    Node head = new Node("hello", new Node("abc", new Node("def")));

    // check head contain "def" -> true / false
    // for loop? while loop -> linkedList 
    Node temp = head;
    boolean result = false;
    while (temp != null){
      //find def
      if("def".equals(temp.getStr())){
        result = true;
        break;
      }

      // move to the next Node
      temp = temp.getNext();
    }
    // Moved inside the loop
    if (result) {
      System.out.println(temp.getStr()); //def
    } else {
      System.out.println("Node containing 'def' not found.");
    }
    System.out.println(result); // true or false depending on if "def" was found

    System.out.println("hello".equals(null)); // false 
  }
}

