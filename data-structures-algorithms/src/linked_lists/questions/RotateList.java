package linked_lists.questions;

/**
 * https://leetcode.com/problems/rotate-list/description/
 */
public class RotateList {
    public static void main(String[] args) {
        ListNode head = ListNode.list(1,2,3,4,5,6);
        int k = 1;
        ListNode newHead = rotateRight(head, k);
        ListNode.print(newHead);
    }

    public static ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null) return head;

        int len = length(head);
        k = k % len;

        if(k == 0) return head;

        ListNode temp = head;
        for(int i=0; i < len-k-1; i++) {
            temp = temp.next;
        }
        ListNode newLast = temp;
        ListNode nextHead = temp.next;

        temp = nextHead;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head = nextHead;
        newLast.next = null;
        return head;
    }

    /**
     * Brute Force
     * TLE when K is a very big value, so reduced k by length of list
     */
    public static ListNode rotateRightBruteForce(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        /**
         * To reduce unnecessary iterations thus preventing TLE
         */
        k = k % length(head);

        for(int i=0; i<k; i++) {

            ListNode current = head;
            ListNode prev = null;

            while(current.next != null) {
                prev = current;
                current = current.next;
            }
            prev.next = null;
            current.next = head;
            head = current;
        }
        return head;
    }

    public static int length(ListNode head) {
        if(head == null) return 0;
        int len = 0;
        while(head != null) {
            head = head.next;
            len++;
        }
        return len;
    }
}
