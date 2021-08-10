package linked_lists.circularsinglylinkedlist;

public class CircularSinglyLinkedList {

	Node head;
	Node tail;
	int size;
	
	public void createLinkedList(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = node;
		head = node;
		tail = node;
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
			node.next = head;
			head = node;
			tail.next = node;
		} else if(location >= size) {
			tail.next = node;
			tail = node;
			node.next = head;
		} else {
			Node temp = head;
			int pos = 0;
			while(pos < location-1) {
				temp = temp.next;
				pos++;
			}
			
			node.next = temp.next;
			temp.next = node;
		}
		size++;
	}
	
	public void traverseList() {
		
		if(head == null) {
			System.out.println("list does not exist");
			return;
		}
		
		Node temp = head;
		for(int i=0 ;i<size; i++) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void searchNodeByValue(int val) {
		
		if(head == null) {
			System.out.println("list does not exist");
			return;
		}
		
		Node temp = head;
		for(int i=0 ;i<size; i++) {
			if(temp.data == val) {
				System.out.println(val + " found at index " + i);
				return;
			}
			temp = temp.next;
		}
		System.out.println(val + " does not exist in the list");
	}
	
	public void deleteNode(int location) {
		if(head == null) {
			System.out.println("list does not exist");
			return;
		}
		//only one element
		if(head.next == head) {
			head = tail = null;
		} else if(location == 0) {
			head = head.next;
			tail.next = head;
		} else if(location >= size-1) {
			Node temp = head;
			int pos = 0;
			
			while(pos < size-2) {
				temp = temp.next;
				pos++;
			}
			
			temp.next = head;
			tail = temp;
		} else {
			Node temp = head;
			int pos = 0;
			
			while(pos < location-1) {
				temp = temp.next;
				pos++;
			}
			
			temp.next = temp.next.next;
		}
		size--;
	}

	public void deleteCircularLL() {
		if(head == null) {
			System.out.println("list does not exist");
		} else {
			head = null;
			tail.next = null;
			tail = null;
			System.out.println("list is deleted successfully");
		}
	}
}
