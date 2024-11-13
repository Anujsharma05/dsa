package stacks_queues.questions;

import java.util.Stack;

/**
 * Remove Efficient
 */

class MyQueueRemove {

  private Stack<Integer> first;
  private Stack<Integer> second;

  public MyQueueRemove() {
    first = new Stack<>();
    second = new Stack<>();
  }

  public void push(int x) {
    //move current items from first to second
    moveItemFromOneToAnother(first, second);

    first.push(x);

    //move items back from second to first
    moveItemFromOneToAnother(second, first);
  }

  public int pop() {
    return first.pop();
  }

  public int peek() {
    return first.peek();
  }

  public boolean empty() {
    return first.isEmpty();
  }

  private void moveItemFromOneToAnother(Stack<Integer> one, Stack<Integer> another) {
    while(!one.isEmpty()) {
      another.push(one.pop());
    }
  }
}
public class QueueUsingStackRemove {

  public static void main(String[] args) {
    MyQueueRemove queue = new MyQueueRemove();
    queue.push(1);
    queue.push(2);
    queue.push(3);
    queue.push(4);

    System.out.println(queue.pop());
    System.out.println(queue.peek());
  }
}
