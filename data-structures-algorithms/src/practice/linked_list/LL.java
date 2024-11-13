package practice.linked_list;

public class LL {

  private Node head;
  private int size;

  private class Node {
    private int data;
    private Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  public void add(int item) {
    addLast(item);
  }

  public void addFirst(int item) {

    Node node = new Node(item);

    if(size != 0) {
      node.next = head;
    }

    head = node;
    size++;
  }

  public void addLast(int item) {
    if(size == 0) {
      addFirst(item);
      return;
    }

    Node temp = head;
    while(temp.next != null) {
      temp = temp.next;
    }

    Node node = new Node(item);

    temp.next = node;
    size++;
  }

  public void add(int index, int item) {

    if(index > size) {
      throw new RuntimeException("Index out of bound");
    }
    if(index == 0) {
      addFirst(item);
      return;
    }
    if(index == size) {
      addLast(item);
      return;
    }

    Node prev = null;
    Node cur = head;

    for(int i=0; i<index; i++) {
      prev = cur;
      cur = cur.next;
    }

    Node node = new Node(item);

    prev.next = node;
    node.next = cur;

    size++;
  }

  public int remove() {
    return removeLast();
  }

  public int removeFirst() {

    if(size == 0) {
      throw new IndexOutOfBoundsException("size:"+size);
    }
    int item = head.data;

    head = head.next;
    size--;

    return item;
  }

  public int removeLast() {
    if(size == 0 || size == 1) {
      return removeFirst();
    }

    Node prev = null;
    Node cur = head;

    while(cur.next != null) {
      prev = cur;
      cur = cur.next;
    }

    int item = cur.data;

    prev.next = null;
    size--;

    return item;
  }

  public void print() {
    Node temp = head;

    while(temp!=null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }
}
