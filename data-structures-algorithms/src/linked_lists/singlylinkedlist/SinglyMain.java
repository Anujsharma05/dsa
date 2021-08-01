package linked_lists.singlylinkedlist;

import java.util.Scanner;

public class SinglyMain {

	public static void main(String[] args) {
		
		SinglyLinkedList sl = new SinglyLinkedList();
		
//		sl.createSinglyLinkedList(5);
		
		System.err.println("Insert the number of nodes to be entered");
		Scanner sc = new Scanner(System.in);
		
		int numberOfNodes = sc.nextInt();
		
		while(SinglyLinkedList.size < numberOfNodes) {
			System.out.println("enter node " + (SinglyLinkedList.size+1) + " value");
			sl.insertNode(sc.nextInt(), SinglyLinkedList.size);
		}
		sc.close();
		
//		sl.traverseNodes();
		int pos = sl.searchByNodeValue(6);
		
		if(pos == -1) System.out.println("Not Found");
		else System.out.println("found at location " + pos);
		
	}

}
