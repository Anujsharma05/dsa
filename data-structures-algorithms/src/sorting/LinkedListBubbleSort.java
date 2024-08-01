package sorting;

import linked_lists.community_classroom.singly_linked_list.SLL;

public class LinkedListBubbleSort {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.add(5,4,3,2,1);
        list.print();
        list.bubbleSort();
        list.print();
    }
}
