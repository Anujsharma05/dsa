package stacks_queues.stacks;

public class CustomStack {

  protected int[] data;

  private static final int DEFAULT_QUANTITY = 10;
  private int ptr = -1;

  public CustomStack() {
    this(DEFAULT_QUANTITY);
  }

  public CustomStack(int size) {
    this.data = new int[size];
  }

  public boolean push(int item) {

    if(isFull()) {
      throw new IllegalStateException("Stack is full");
    }

    ptr++;
    data[ptr] = item;
    return true;
  }

  public int pop() {
    if(isEmpty()) {
      throw new IllegalStateException("Cannot pop from an empty stack");
    }
//    int removed = data[ptr];
//    ptr--;
    return data[ptr--];
  }

  public int peek() {
    if(isEmpty()) {
      throw new IllegalStateException("Cannot peek from an empty stack");
    }
    return data[ptr];
  }

  /**
   * Pointer is at last index
   */
  protected boolean isFull() {
    return ptr == data.length-1;
  }

  private boolean isEmpty() {
    return ptr == -1;
  }

}
