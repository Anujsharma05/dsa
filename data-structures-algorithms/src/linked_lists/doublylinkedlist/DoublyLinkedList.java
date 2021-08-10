package linked_lists.doublylinkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int size;

    public void createLinkedList(int data) {
        Node node = new Node();
        node.data = data;
        node.prev = node.next = null;
        head = tail = node;
        size = 1;
    }

    public void insertNode(int data, int location) {
        if(head == null) {
            createLinkedList(data);
            return;
        }

        Node node = new Node();
        node.data = data;

        if(location == 0) {
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        } else if(location >= size) {
            node.prev = tail;
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node temp = head;
            int pos = 0;

            while(pos < location-1) {
                temp = temp.next;
                pos++;
            }

            node.prev = temp;
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
        }
        size++;
    }

    public void traverseLinkedList() {

        if(head == null) {
            System.out.println("list does not exist");
            return;
        }
        Node temp = head;
        for(int i=0; i<size; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void searchNode(int val) {
        if(head == null) {
            System.out.println("list does not exist");
           return;
        }
        Node temp = head;
        for(int i=0; i<size; i++) {
            if(temp.data == val) {
                System.out.println(val + " found at index " + i);
                return;
            }
            temp = temp.next;
        }

        System.out.println("item does not exist in the list");
    }

    public void deleteNode(int location) {
        if(head == null) {
            System.out.println("list does not exist");
            return;
        }

        if(head.next == null) {
            head = tail = null;
        } else if(location == 0) {
            head = head.next;
            head.prev = null;
        } else if(location >= size-1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            int pos = 0;
            Node temp = head;

            while(pos < location) {
                temp = temp.next;
                pos++;
            }

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
    }

    public void deleteDoublyLinkedList() {

        if(head == null) {
            System.out.println("list does not exist");
        }

        Node temp = head;

        for(int i=0; i<size; i++) {
            temp.prev = null;
            temp = temp.next;
        }
        head = tail = null;

        System.out.println("list has been deleted");
    }

    public void traverseLinkedListReverse() {
        if(head == null) {
            System.out.println("list does not exist");
            return;
        }
        Node temp = tail;
        for(int i=0; i<size; i++) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
