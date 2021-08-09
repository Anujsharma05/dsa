package linked_lists.circularsinglylinkedlist;

public class Main {

	public static void main(String[] args) {
		CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
//		cll.createLinkedList(5);
		cll.insertNode(1, 0);
		cll.insertNode(2, 1);
		cll.insertNode(4, 2);
		cll.insertNode(5, 3);
		cll.insertNode(3, 2);
		cll.traverseList();
		cll.deleteNode(6);
		cll.traverseList();
	}
}
