package linked_lists.questions;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.list(1,2,3,4,5,6);
        ListNode middle = middleNodeBruteForce(head);
        System.out.println(middle.val);
    }

    public static ListNode middleNodeBruteForce(ListNode head) {
        int len = lengthOfList(head);
        for(int i=0; i<len/2; i++) {
            head = head.next;
        }
        return head;
    }

    static int lengthOfList(ListNode head) {
        int len = 0;
        while(head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    /**
     * slow and fast pointer approach
     * single pass
     */
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
