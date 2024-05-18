package linked_lists.questions;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {
        ListNode operation = new ListNode();
        ListNode head = operation.list(1,1,1,3,4,4,5,5,6,6);

        ListNode hh = deleteDuplicates(head);
        operation.print(hh);
    }

    static ListNode deleteDuplicates(ListNode head) {
        return rec(head, head.next);
    }
    static ListNode rec(ListNode cur, ListNode next) {
         if(next == null) {
            cur.next = null;
            return cur;
        }
        if(cur.val == next.val) {
            rec(cur, next.next);
        } else {
            cur.next = next;
            rec(next, next.next);
        }
        return cur;
    }

//    public static ListNode deleteDuplicates(ListNode head) {
//        ListNode node = head;
//        while(node.next != null) {
//            if(node.val == node.next.val) {
//                node.next = node.next.next;
//            } else {
//                node = node.next;
//            }
//        }
//        return head;
//    }
    public static ListNode deleteDuplicatesRecursive(ListNode head) {
        if(head == null) return null;
        helper(head, head.next);
        return head;
    }
    static void helper(ListNode base, ListNode ptr) {
        if(ptr == null) {
            return;
        }
        if(base.val == ptr.val) {
            base.next = ptr.next;
            helper(base, ptr.next);
        } else {
            helper(ptr, ptr.next);
        }
    }
}
