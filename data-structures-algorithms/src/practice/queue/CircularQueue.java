package practice.queue;

import java.util.Arrays;

public class CircularQueue {

  protected int[] arr;
  private int size = 0;
  private int start = 0;
  private int end = 0;
  private static final int DEFAULT_SIZE = 10;

  public CircularQueue() {
    this(DEFAULT_SIZE);
  }
  public CircularQueue(int size) {
    arr = new int[size];
  }

  public int size() {
    return size;
  }

  public void offer(int item) {
    if(isFull()) {
      throw new RuntimeException("Queue is full");
    }
    arr[end++] = item;
    end = end % arr.length;
    size++;
  }

  public int poll() {
    if(isEmpty()) {
      throw new RuntimeException("Queue is Empty");
    }
    int removed = arr[start++];
    start = start % arr.length;
    size--;
    return removed;
  }

  public int peek() {
    if(isEmpty()) {
      throw new RuntimeException("Queue is Empty");
    }
    return arr[start];
  }

  public void print() {

    int i = start;
    do {
      System.out.print(arr[i++]+",");
      i = i % arr.length;
    } while(i != end);
    System.out.println();
  }

  public void printInternalArr() {
    System.out.println(Arrays.toString(arr));
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == arr.length;
  }
}
