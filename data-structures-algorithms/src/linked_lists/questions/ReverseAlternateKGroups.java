package linked_lists.questions;

/**
 * https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
 */
public class ReverseAlternateKGroups {
    public static void main(String[] args) {
        ListNode head = ListNode.list(1,2,3,4,5,6,7,8,9,10);
        int k = 2;
        ListNode newHead = reverseAlternate(head, k);
        ListNode.print(newHead);
    }
    static ListNode reverseAlternate(ListNode head, int k) {

        ListNode current = head;
        ListNode prev = null;

        while(current != null) {
            ListNode leftJoint = prev;
            ListNode subTail = current;

            //reverse
            for(int i=0; current!=null && i<k; i++) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            ListNode subHead = prev;
            ListNode rightJoint = current;

            if(leftJoint == null) {
                head = subHead;
            } else {
                leftJoint.next = subHead;
            }
            subTail.next = rightJoint;
            prev = subTail;

            for(int i=0; current!=null && i<k; i++) {
                prev = current;
                current = current.next;
            }
        }

        return head;
    }
}
