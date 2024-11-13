package practice.stack;

public class MyStack {

  protected int[] arr;
  private static final int DEFAULT_SIZE = 5;
  protected int ptr = 0;

  public MyStack() {
    this(DEFAULT_SIZE);
  }

  public MyStack(int size) {
    arr = new int[size];
  }

  public void push(int item) {
    if(isFull()) {
      throw new RuntimeException("Stack is full");
    }
    arr[ptr++] = item;
  }

  public int pop() {
    if(isEmpty()) {
      throw new RuntimeException("Stack is already empty");
    }
    return arr[--ptr];
  }


  public int peek() {
    if(isEmpty()) {
      throw new RuntimeException("Stack is already empty");
    }
    return arr[ptr-1];
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
