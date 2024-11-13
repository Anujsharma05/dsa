package stacks_queues.queues;

import java.util.Arrays;

public class DynamicCircularQueueMain {

  public static void main(String[] args) {
    DynamicCircularQueue queue = new DynamicCircularQueue(5);
    queue.insert(4);
    queue.insert(5);
    queue.insert(1);
    queue.insert(2);
    queue.insert(3);
    queue.display();
    queue.remove();
    queue.remove();

    queue.insert(4);
    queue.insert(5);
    queue.insert(6);

    queue.display();
    System.out.println(Arrays.toString(queue.data));
  }
}
