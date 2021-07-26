package linked_lists.singlylinkedlist;

public class SinglyLinkedList {

	Node head;
	Node tail;
	static int size;

	public Node createSinglyLinkedList(int dataValue) {
		
		Node node = new Node();
		node.setNext(null);
		node.setData(dataValue);
		
		size = 1;
		
		head = node;
		tail = node;
		
		return head;
	}
	
	public void insertNode(int dataValue, int location) {
		
		Node node = new Node();
		node.setData(dataValue);
		
		//if linkedlist is not created
		if(head == null) {
			createSinglyLinkedList(dataValue);
			return;
		} else if(location == 0) {
			node.setNext(head);
			head = node;
		} else if(location >= size) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		} else {
			Node tempNode = head;
			int index = 0;
			
			while(index < location-1) {
				tempNode = tempNode.getNext();
				index++;
			}
			
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
		}
		size++;
	}
}
