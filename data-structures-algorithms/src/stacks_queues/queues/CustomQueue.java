package stacks_queues.queues;

/**
 * Insert efficient queue, remove inefficient
 *
 * To make remove efficient, add new values at 0 index,
 * then removing will become efficient but adding will become inefficient
 */
public class CustomQueue {

  protected int[] data;
  private static final int DEFAULT_QUANTITY = 10;
  private int end = 0;

  public CustomQueue() {
    this(DEFAULT_QUANTITY);
  }

  public CustomQueue(int size) {
    this.data = new int[size];
  }

  public boolean insert(int item) {
    if(isFull()) {
      throw new IllegalStateException("Queue is full");
    }

    data[end++] = item;
    return true;
  }

  public int remove() {
    if(isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }

    int removed = data[0];

    //shifting items to left
    for(int i=1; i<end; i++) {
      data[i-1] = data[i];
    }
    end--;
    return removed;
  }

  protected boolean isFull() {
    return end == data.length;
  }

  protected boolean isEmpty() {
    return end == 0;
  }

  public int front() {
    if(isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    return data[0];
  }

  public void display() {
    for(int i=0; i<end; i++) {
      System.out.print(data[i] + " <- ");
    }
    System.out.println("END");
  }
}
