package linked_lists.questions;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public void createLinkedList(int data) {
        Node node = new Node();
        node.value = data;
        node.next = null;
        head = tail = node;
        size = 1;
    }

    public void insertNode(int data) {
        if(head == null) {
            createLinkedList(data);
            return;
        } else {
            Node node = new Node();
            node.value = data;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void traverseLinkedList() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
