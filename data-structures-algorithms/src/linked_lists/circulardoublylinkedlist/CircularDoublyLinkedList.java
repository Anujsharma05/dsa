package linked_lists.circulardoublylinkedlist;

public class CircularDoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public void createLinkedList(int data){
        Node node = new Node();
        node.data = data;
        node.prev = node.next = node;
        head = tail = node;
        size = 1;
    }

    public void insertNode(int data, int location){
        if(head==null) {
            createLinkedList(data);
            return;
        }

        Node node = new Node();
        node.data = data;

        if(location == 0){
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        } else if(location >= size){
            node.prev = tail;
            node.next = head;
            tail.next = node;
            head.prev = node;
            tail = node;
        } else {
            int pos = 0;
            Node temp = head;

            while(pos < location-1){
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

        if(head==null) {
            System.out.println("list does not exist");
            return;
        }

        Node temp = head;
        int pos = 0;

        while(pos < size) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            pos++;
        }
        System.out.println();
    }

    public void traverseLinkedListReverse() {

        if(head==null) {
            System.out.println("list does not exist");
            return;
        }

        Node temp = tail;
        int pos = 0;

        while(pos < size) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
            pos++;
        }
        System.out.println();
    }

    public void searchNodeByValue(int val) {

        if(head==null) {
            System.out.println("list does not exist");
            return;
        }

        Node temp = head;
        int pos = 0;

        while(pos < size) {
            if(temp.data == val) {
                System.out.println(val + " found at location " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println(val + " doesn't exist in the list");
    }

    public void deleteNode(int location) {
        if(head==null) {
            System.out.println("list does not exist");
            return;
        }
        if(head.next == head) {
            head.next = head.prev = null;
            head = tail = null;
        } else if(location == 0) {
            tail.next = head.next;
            head.next.prev = tail;
            head = head.next;
        } else if(location >= size-1) {
            head.prev = tail.prev;
            tail.prev.next = head;
            tail = tail.prev;
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

    public void deleteCircularDoublyLinkedList() {
        Node temp = head;
        for(int i=0; i<size; i++) {
            temp.prev = null;
            temp = temp.next;
        }

        tail.next = null;
        head = tail = null;

        System.out.println("list has been deleted");
    }
}
