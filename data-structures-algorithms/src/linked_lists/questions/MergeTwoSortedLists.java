package linked_lists.questions;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
//        list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1 = ListNode.list(1,2,4);
        ListNode list2 = ListNode.list(1,3,4);
        ListNode merged = mergeTwoLists(list1, list2);
        ListNode.print(merged);
    }

    /**
     * Creating new output list
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNodeOperation list = new ListNodeOperation();
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                list.addLast(list1.val);
                list1 = list1.next;
            } else {
                list.addLast(list2.val);
                list2 = list2.next;
            }
        }
        while(list1 != null) {
            list.addLast(list1.val);
            list1 = list1.next;
        }
        while(list2 != null) {
            list.addLast(list2.val);
            list2 = list2.next;
        }
        return list.head;
    }

    /**
     * Inplace
     */
    public static ListNode mergeTwoListsInplace(ListNode list1, ListNode list2) {

        ListNode ptr = null;
        ListNode head = null;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                if(ptr == null) {
                    ptr = list1;
                    head = list1;
                } else {
                    ptr.next = list1;
                    ptr = ptr.next;
                }
                list1 = list1.next;
            } else {
                if(ptr == null) {
                    ptr = list2;
                    head = list2;
                } else {
                    ptr.next = list2;
                    ptr = ptr.next;
                }
                list2 = list2.next;
            }
        }

        while(list1 != null) {
            if(ptr == null) {
                ptr = list1;
                head = list1;
            } else {
                ptr.next = list1;
                ptr = ptr.next;
            }
            list1 = list1.next;
        }
        while(list2 != null) {
            if(ptr == null) {
                ptr = list2;
                head = list2;
            } else {
                ptr.next = list2;
                ptr = ptr.next;
            }
            list2 = list2.next;
        }
        return head;
    }
}
