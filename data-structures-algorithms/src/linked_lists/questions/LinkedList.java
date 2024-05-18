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
        if (head == null) {
            createLinkedList(data);
            return;
        }
        Node node = new Node();
        node.value = data;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void recursiveInsertion(int index, int value) {
        head = recursiveInsertion(index, value, head);
    }

    private Node recursiveInsertion(int index, int value, Node node) {
        if (index == 0) {
            Node newNode = new Node(value);
            newNode.next = node;
            size++;
            return newNode;
        }
        node.next = recursiveInsertion(index - 1, value, node.next);
        return node;
    }
}
