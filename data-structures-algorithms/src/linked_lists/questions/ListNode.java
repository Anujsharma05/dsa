package linked_lists.questions;

public class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode list(int ...values) {
        ListNode nextNode = null;
        for(int i=values.length-1; i>=0; i--) {
            ListNode node = new ListNode(values[i]);
            node.next = nextNode;
            nextNode = node;
        }
        return nextNode;
    }
    public void print(ListNode node) {
        while(node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("null");
    }
}
