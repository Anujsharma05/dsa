package linked_lists.community_classroom.doubly_linked_list;

import java.util.NoSuchElementException;

public class DLL {
    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private int size;
    private Node head;
    private Node tail;

    public int size() {
        System.out.println("size: " + size);
        return size;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (size == 0) {
            head = node;
            tail = node;
            size++;
            return;
        }
        head.prev = node;
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(int value) {
        if (size == 0) {
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    private void addIntermediate(int index, int value) {
        Node node = new Node(value);
        Node prevNode = head;
        for(int i=1; i<index; i++) {
            prevNode = prevNode.next;
        }
        node.next = prevNode.next;
        node.prev = prevNode;
        prevNode.next.prev = node;
        prevNode.next = node;
        size++;
    }

    public void add(int index, int value) {
        if(index > size) {
            throw new IndexOutOfBoundsException("size: " + size);
        }
        if(index == 0) {
            addFirst(value);
        } else if(index == size) {
            addLast(value);
        } else {
            addIntermediate(index, value);
        }
    }

    public int deleteFirst() {
        if(size == 0) throw new NoSuchElementException("Empty list");
        int value = head.value;
        head.next.prev = null;
        head = head.next;
        size--;
        return value;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");

        StringBuilder sb= new StringBuilder();
        sb.append("head: ").append(head.value).append(", ");
        sb.append("tail: ").append(tail.value).append(", ");
        sb.append("size: ").append(size);
        System.out.println(sb);
    }

    public void printReverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.println("null");
        System.out.println("head: " + head.value);
        System.out.println("tail: " + tail.value);
        System.out.println("size: " + size);
    }
}
