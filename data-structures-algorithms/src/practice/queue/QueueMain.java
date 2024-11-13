package practice.queue;

public class QueueMain {

  public static void main(String[] args) {
    CircularQueue cq = new CircularQueue(5);
    cq.offer(1);
    cq.offer(2);
    cq.offer(3);
    cq.offer(4);
    cq.offer(5);
    cq.poll();
    cq.poll();
    cq.print();
    cq.printInternalArr();
    System.out.println(cq.size());
  }
}
