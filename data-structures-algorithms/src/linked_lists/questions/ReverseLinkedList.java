package linked_lists.questions;

import linked_lists.community_classroom.singly_linked_list.SLL;

/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.add(1,2,3,4,5);
        list.print();
//        list.reverse();
//        list.reverseUsingTail(list.getHead());
        list.reverseIterativeInPlace();
        list.print();
    }
}
