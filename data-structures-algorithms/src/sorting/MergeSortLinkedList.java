package sorting;

import linked_lists.questions.ListNode;

public class MergeSortLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.list(5,4,3,2,1,11);
        ListNode sortedHead = sortList(head);
        ListNode.print(sortedHead);
    }
    public static ListNode sortList(ListNode head) {
        /**
         * base condition: when zero or one item in list
         */
        if(head == null || head.next == null) {
            return head;
        }

        /**
         * Break list in 2 parts
         * firstHalf: head -> midPrev
         * secondHalf: mid -> end(null)
         */
        ListNode mid = getMid(head);

        ListNode firstHalf = sortList(head);
        ListNode secondHalf = sortList(mid);
        return merge(firstHalf, secondHalf);
    }
    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode ptr = dummyHead;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                ptr.next = list1;
                list1 = list1.next;
            } else {
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }
        ptr.next = (list1 == null) ? list2 : list1;
        return dummyHead.next;
    }

    /**
     * This code will not run if there is less than two elements in the list
     */
    public static ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while(head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
