package linked_lists.questions;

import linked_lists.community_classroom.singly_linked_list.SLL;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/
 */
public class ReverseLinkedList2 {
    public static void main(String[] args) {
        ListNode head = ListNode.list(1,2,3,4,6);
        ListNode.print(head);
        ListNode newHead = reverseTest(head, 1,6);
        ListNode.print(newHead);
    }

    public static ListNode reverseTest(ListNode head, int left, int right) {
        if(left == right || head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        //skip before left
        for(int i=0; current!=null && i<left-1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode leftJoint = prev;
        ListNode subTail = current;

        for(int i=0; current!=null && i<right-left+1; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode subHead = prev;
        ListNode rightJoin = current;

        subTail.next = rightJoin;

        if(leftJoint == null) {
            head = subHead;
        } else {
            leftJoint.next = subHead;
        }
        return head;
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head.next;

        ListNode leftJoint = null;
        ListNode rightJoint = null;
        ListNode subHead = null;
        ListNode subTail = null;

        int curPos = 1;

        while(cur != null) {
            if(curPos == left) {
                leftJoint = prev;
                subTail = cur;
            }

            if(left < curPos && curPos <= right) {
                cur.next = prev;
            }
            if(curPos == right) {
                rightJoint = next;
                subHead = cur;
                break;
            }
            prev = cur;
            cur = next;
            next = next == null ? null : next.next;
            curPos++;
        }
        subTail.next = rightJoint;

        if(left == 1)
            return subHead;

        leftJoint.next = subHead;
        return head;
    }

    /**
     * Write code again with this logic to understand better
     */
    public static ListNode reverseBetweenCommunityClassroom(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }
}
