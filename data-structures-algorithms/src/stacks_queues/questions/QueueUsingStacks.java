package stacks_queues.questions;

/**
 * https://leetcode.com/problems/implement-queue-using-stacks/description/
 *
 * Below implementation is Insert-Efficient (insert O(1), remove O(n))
 */

class MyQueue {

  /**
   * Instead of custom stack, we can also use java.util.Stack
   */
  private MyStack first;
  private MyStack second;

  public MyQueue() {
    first = new MyStack();
    second = new MyStack();
  }

  public void push(int x) {
    first.push(x);
  }

  public int pop() {
    //pop from first push into second
    moveItemFromOneToAnother(first, second);

    //pop from second to get the desired item
    int removed = second.pop();

    //pop from second push into one
    moveItemFromOneToAnother(second, first);

    return removed;
  }

  public int peek() {
    //pop from first push into second
    moveItemFromOneToAnother(first, second);

    //pop from second to get the desired item
    int peeked = second.peek();

    //pop from second push into one
    moveItemFromOneToAnother(second, first);

    return peeked;
  }

  public boolean empty() {
    return first.isEmpty();
  }

  private void moveItemFromOneToAnother(MyStack one, MyStack another) {
    while(!one.isEmpty()) {
      another.push(one.pop());
    }
  }
}

class MyStack {
  private int[] data;
  private int ptr = 0;

  public MyStack() {
    data = new int[100];
  }

  public void push(int x) {
    if(isFull()) return;
    data[ptr++] = x;
  }

  public int pop() {
    if(isEmpty()) return -1;
    int removed = data[--ptr];
    return removed;
  }

  public int peek() {
    if(isEmpty()) return -1;
    return data[ptr-1];
  }

  public boolean isFull() {
    return ptr == data.length;
  }

  public boolean isEmpty() {
    return ptr == 0;
  }
}

public class QueueUsingStacks {

  public static void main(String[] args) {
    MyQueue queue = new MyQueue();
    queue.push(1);
    queue.push(2);
    queue.push(3);

    System.out.println(queue.pop());
    System.out.println(queue.peek());
  }
}
