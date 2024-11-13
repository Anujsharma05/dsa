package practice.queue;

public class CustomQueue {
  protected int[] arr;
  private static final int DEFAULT_SIZE = 5;
  protected int ptr = 0;

  public CustomQueue() {
    this(DEFAULT_SIZE);
  }

  public CustomQueue(int size) {
    arr = new int[size];
  }

  public void offer(int item) {
    if(isFull()) {
      throw new RuntimeException("queue is full");
    }
    arr[ptr++] = item;
  }

  public int poll() {
    if(isEmpty()) {
      throw new RuntimeException("queue is already empty");
    }
    int removed = arr[0];

    for(int i=1; i<ptr; i++) {
      arr[i-1] = arr[i];
    }
    ptr--;

    return removed;
  }


  public int peek() {
    if(isEmpty()) {
      throw new RuntimeException("queue is already empty");
    }
    return arr[0];
  }

  public boolean isEmpty() {
    return ptr == 0;
  }

  public boolean isFull() {
    return ptr == arr.length;
  }

  public int size() {
    return ptr;
  }
}
