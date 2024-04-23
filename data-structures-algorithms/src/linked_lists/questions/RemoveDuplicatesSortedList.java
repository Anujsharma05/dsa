package linked_lists.questions;

public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {
        ListNode operation = new ListNode();
        ListNode head = operation.list(1,1,1,3,4,4);

        ListNode hh = deleteDuplicates(head);
        operation.print(hh);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(node.next != null) {
            if(node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
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
