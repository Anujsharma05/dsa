package stacks_queues.queues;

public class CircularQueueMain {

  public static void main(String[] args) {
    CircularQueue queue = new CircularQueue(5);
    queue.insert(1);
    queue.insert(2);
    queue.insert(3);
    queue.insert(4);
    queue.insert(5);
    queue.display();
    queue.remove();
    queue.remove();
//    queue.insert(6);
//    queue.insert(7);
//    queue.remove();
    queue.display();

  }
}
