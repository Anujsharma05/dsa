package linked_lists.questions;

public class RecursiveInsertion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertNode(3);
        list.insertNode(5);
        list.insertNode(9);
        list.insertNode(1);
        list.print();
        list.recursiveInsertion(0, 7);
        list.print();
    }
}
