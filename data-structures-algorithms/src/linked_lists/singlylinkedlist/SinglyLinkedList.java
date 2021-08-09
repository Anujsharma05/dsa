package linked_lists.singlylinkedlist;

public class SinglyLinkedList {

	Node head;
	Node tail;
	int size;

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
	
	public void traverseNodes() {
		if(head == null) return;
		
		Node node = head;
		
		while(node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
	}
	
	public int searchByNodeValue(int val) {
		
		int loc = -1;
		int pos = 1;
		Node tempNode = head;
		
		while(tempNode != null) {
			if(tempNode.getData() == val) {
				loc = pos;
				break;
			}
			pos++;
			tempNode = tempNode.getNext();
		}
		
		return loc;
	}
	
	public void deleteNode(int location) {
		if(head == null) {
			System.err.println("list does not exitst");
			return;
		} 
		//only one element
		if(head.getNext() == null){
			head = null;
			tail = null;
		}else if(location == 0) {
			head = head.getNext();
		} else if(location >= size-1) {
			Node ptr2 = head;
			Node ptr1 = ptr2.getNext();
			while(ptr1.getNext() != null) {
				ptr2 = ptr1;
				ptr1 = ptr1.getNext();
			}
			
			ptr2.setNext(null);
			tail = ptr2;
			ptr1 = null;
		} else {
			Node ptr1 = head;
			int count = 0;
			
			while(count < location - 1) {
				ptr1 = ptr1.getNext();
				count++;
			}
			
			Node node = ptr1.getNext();
			ptr1.setNext(node.getNext());
			node = null;
		}
		size--;
	}
	
	public void deleteEntireList() {
		head = tail = null;
	}
}
