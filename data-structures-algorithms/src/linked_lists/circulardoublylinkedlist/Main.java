package linked_lists.circulardoublylinkedlist;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createLinkedList(2);
        cdll.insertNode(1, 0);
        cdll.insertNode(0, 0);
        cdll.insertNode(4, 3);
        cdll.insertNode(3,3);
        cdll.searchNodeByValue(2);
        cdll.traverseLinkedList();
        cdll.traverseLinkedListReverse();
        cdll.deleteNode(3);
        cdll.traverseLinkedList();
        cdll.deleteCircularDoublyLinkedList();
        cdll.traverseLinkedList();
    }
}
