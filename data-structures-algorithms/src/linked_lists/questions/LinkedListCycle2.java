package linked_lists.questions;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/description/
 */
public class LinkedListCycle2 {
    public static void main(String[] args) {
        ListNode head = ListNode.list(1,2,3,4,5,6,7,8);
//        LinkedListCycle.addCycle(head);
        ListNode cycleStart = findCycleStart(head);
        System.out.println(cycleStart.val);
    }
    static ListNode findCycleStart(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                ListNode temp = head;

                while(temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp;
            }
        }
        return null;
    }
}
