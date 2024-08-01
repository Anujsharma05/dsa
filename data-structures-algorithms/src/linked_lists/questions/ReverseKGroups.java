package linked_lists.questions;

import recursion.revision.Palindrome;

/**
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 */
public class ReverseKGroups {
    public static void main(String[] args) {
        ListNode head = ListNode.list(1,2,3,4,5);
        int k = 3;
        ListNode newHead = reverseKGroup(head, k);
        ListNode.print(newHead);
    }
    public static ListNode reverseKGroup(ListNode head, int k) {

        //base case
        if(k == 1 || head == null || head.next == null) return head;

        ListNode current = head;
        ListNode prev = null;
        ListNode ptr = current;
        while(ptr!= null) {

            ptr = current;

            for(int i=0; ptr!=null && i<k-1; i++) {
                ptr = ptr.next;
            }
            //exit case
            if(ptr == null) return head;

            ListNode leftJoint = prev;
            ListNode subTail = current;

            for(int i=0; i<k; i++) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            ListNode rightJoint = current;
            ListNode subHead = prev;

            if(leftJoint == null) {
                head = subHead;
            } else {
                leftJoint.next = subHead;
            }
            subTail.next = rightJoint;
            prev= subTail;
        }

        return head;
    }
}
