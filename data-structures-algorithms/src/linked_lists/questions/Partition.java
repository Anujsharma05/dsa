package linked_lists.questions;

public class Partition {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertNode(3);
        l.insertNode(5);
        l.insertNode(8);
        l.insertNode(5);
        l.insertNode(10);
        l.insertNode(2);
        l.insertNode(1);

        Partition obj = new Partition();

        int x = 5;
        LinkedList part = obj.partition(l, x);

        part.traverseLinkedList();
    }
    LinkedList partition(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }
}
