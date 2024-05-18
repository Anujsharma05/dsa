package linked_lists.questions;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {
    public static void main(String[] args) {

        ListNode head = ListNode.list(1,2,3,4,5,6,7,8);
        LinkedListCycle.addCycle(head);
        boolean hasCycle = LinkedListCycle.hasCycle(head);
        System.out.println(hasCycle);

        int cycleSize = findCycleLength(head);
        System.out.println(cycleSize);
    }

    /**
     * List will become=> 1->2->3->4->5->6->7->8->4->5->6->7->8->4->5->6->7->8->4
     */
    public static void addCycle(ListNode head) {
        ListNode temp = head;
        ListNode cycleStart = null;
        while(temp.next != null) {
            if(temp.val == 4) {
                cycleStart = temp;
            }
            temp = temp.next;
        }
        temp.next = cycleStart;
    }

    /**
     * coding classroom
     */
    public static boolean hasCycleCleanCode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * my code
     */
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        boolean hasCycle = false;

        while(fast != null) {
            //slow: 1 step
            slow = slow.next;
            //fast: 2 steps
            if(fast.next == null) {
                return false;
            }
            fast = fast.next.next;

            //fast and slow pointer meet at some point
            if(slow == fast) return true;
        }
        return hasCycle;
    }

    /**
     * Follow up question: Find the length of the cycle
     * ie. In above example, the cycle is 4->5->6->7->8 (length=5)
     */
    public static int findCycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                int count = 0;
                do {
                    slow = slow.next;
                    count++;
                } while(slow != fast);

                return count;
            }
        }
        return 0;
    }
}
