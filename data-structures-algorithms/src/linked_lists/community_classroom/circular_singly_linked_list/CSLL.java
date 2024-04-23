package linked_lists.community_classroom.circular_singly_linked_list;

public class CSLL {
    private class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int size;

    public void addFirst(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
            node.next = head;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        head = node;
        size++;
    }

    public void print() {
        Node temp = head;
        do {
            System.out.print(temp.value + "->");
            temp = temp.next;
        } while(temp != head);
    }
}
