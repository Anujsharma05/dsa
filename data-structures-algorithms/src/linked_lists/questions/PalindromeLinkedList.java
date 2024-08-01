package linked_lists.questions;

/**
 * https://leetcode.com/problems/palindrome-linked-list/description/
 */
public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.list(1,2,3,2,1);
        ListNode.print(head);
        boolean isPalindrome = isPalindrome(head);
        System.out.println(isPalindrome);
        ListNode.print(head);
    }
    public static boolean isPalindrome(ListNode head) {
        //single element
        if(head.next == null) return true;

        ListNode oldMid = ListNode.getMid(head);
        ListNode newHead = ListNode.reverseList(oldMid);
        ListNode temp = newHead;
        while(head != null && newHead != null) {
            if(head.val != newHead.val) {
                break;
            }
            head = head.next;
            newHead = newHead.next;
        }
        /**
         * To revert the list back to original
         */
        ListNode.reverseList(temp);
        return head == null || newHead == null;
    }


}
