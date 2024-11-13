package stacks_queues.queues;

public class CircularQueue {
  protected int[] data;
  private static final int DEFAULT_QUANTITY = 10;
  protected int start = 0;
  protected int end = 0;
  protected int size = 0;

  public CircularQueue() {
    this(DEFAULT_QUANTITY);
  }

  public CircularQueue(int size) {
    this.data = new int[size];
  }

  public boolean insert(int item) {
    if(isFull()) {
      throw new IllegalStateException("Circular Queue is full");
    }

    data[end++] = item;
    end = end % data.length;

    size++;

    return true;
  }

  public int remove() {
    if(isEmpty()) {
      throw new IllegalStateException("Circular queue is empty");
    }

    int removed = data[start++];
    start = start % data.length;
    size--;
    return removed;
  }

  protected int front() {
    if(isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    return data[start];
  }

  protected void display() {

    if(isEmpty()) {
      System.out.println("Empty");
      return;
    }

    int i = start;
    do {
      System.out.print(data[i++] + "<-");
      i = i % data.length;
    } while(i != end);
    System.out.println("End");
  }

  protected boolean isEmpty() {
    return size == 0;
  }

  protected boolean isFull() {
    return size == data.length;
  }
}
