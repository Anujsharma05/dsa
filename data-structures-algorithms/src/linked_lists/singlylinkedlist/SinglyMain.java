package linked_lists.singlylinkedlist;

public class SinglyMain {

	public static void main(String[] args) {
		
		SinglyLinkedList sl = new SinglyLinkedList();
		
		sl.createSinglyLinkedList(5);
		sl.insertNode(4, 0);
		System.out.print(sl.head.getData());
	}

}
