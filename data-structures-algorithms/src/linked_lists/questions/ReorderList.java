package linked_lists.questions;

/**
 * https://leetcode.com/problems/reorder-list/
 */
public class ReorderList {
    public static void main(String[] args) {
        ListNode head = ListNode.list(1, 2, 3, 4);
        ListNode.print(head);
        reorderListAnother(head);
        ListNode.print(head);
    }

    public static void reorderList(ListNode head) {

        if (head.next == null || head.next.next == null) return;

        ListNode mid = ListNode.getMid(head);
        ListNode reverseHead = ListNode.reverseList(mid);
        ListNode dummyNode = new ListNode();

        while (head != mid && reverseHead != null) {
            ListNode temp1 = head.next;
            ListNode temp2 = reverseHead.next;

            dummyNode.next = head;
            head.next = reverseHead;

            head = temp1;
            reverseHead = temp2;

            dummyNode = dummyNode.next.next;
        }
        if (reverseHead != null) {
            dummyNode.next = mid;
        }
    }

    public static void reorderListAnother(ListNode head) {

        if (head.next == null || head.next.next == null) return;

        ListNode mid = ListNode.getMid(head);
        ListNode hs = ListNode.reverseList(mid);
        ListNode hf = head;
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null) {
            hf.next = null;
        }
    }
}
