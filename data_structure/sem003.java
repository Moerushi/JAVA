package data_structure;

public class sem003 {

  public static void main(String[] args) {
    MyList myList = new MyList();
    for (int i = 0; i < 10; i++) {
      myList.addLast(i);
    }
    System.out.println(myList);
    myList.removeFirst();
    myList.removeLast();
    System.out.println(myList);

  }
}

class MyList {
  private Node head;
  private Node tail;

  private class Node {
    private int value;
    private Node nextNode;
    private Node previousNode;

    public Node (int value){
    this.value = value;
  }
  }

  public boolean addFirst(int value) {
    Node node = new Node(value);
    node.value = value;

    if (head == null) {
      head = node;
      return true;
    }
    
    head.previousNode = node;
    node.nextNode = head;
    head = node;
    return true;
  }

  public Node search(int value) {
    if (head == null)
      return null;
    for (Node temp = head; temp != null; temp = temp.nextNode) {
      if (temp.value == value)
        return temp;
    }
    return null;
  }

  public Integer removeFirst() {
    if (head == null)
      return null;
    int temp = head.value;
    head = head.nextNode;
    if (head != null) head.previousNode = null;
    return temp;
  }

  public Integer removeLast() {
    if (tail == null)
      return null;
    int tmp = tail.value;
    tail.previousNode.nextNode = null;
    tail = tail.previousNode;
    return tmp;
  }

  public void addLast(int value) {
    if (head == null) {
      addFirst(value);
      return;
    }
    if (tail == null) {
      tail = new Node (value);
      return;
    }
    tail.nextNode = new Node(value);
    tail.nextNode.previousNode = tail;
    tail = tail.nextNode;
    
  }

  @Override
  public String toString() {
    String str = "{ ";
    for (Node temp = tail; temp != null; temp = temp.previousNode) {
      str += String.valueOf(temp.value) + " ";
    }
    return str + "}";
  }

}
