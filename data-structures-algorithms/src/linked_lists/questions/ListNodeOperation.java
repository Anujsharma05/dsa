package linked_lists.questions;

public class ListNodeOperation {
    ListNode head;
    ListNode tail;
    int size;

    public ListNode addLast(int val) {
        ListNode node = new ListNode(val);
        size++;
        if(head == null) {
            head = node;
            tail = node;
            return node;
        }
        tail.next = node;
        tail = node;
        return head;
    }

    public ListNode list(int ...values) {
        ListNode nextNode = null;
        for(int i=values.length-1; i>=0; i--) {
            ListNode node = new ListNode(values[i]);
            node.next = nextNode;
            if(node.next == null) {
                tail = node;
            }
            nextNode = node;
            this.size++;
        }
        this.head = nextNode;
        return nextNode;
    }
}
