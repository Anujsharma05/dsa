package linked_lists.questions;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public String toString() {
        if(this == null) {
            return "null";
        }
        return String.valueOf(this.val);
    }
    public static ListNode list(int ...values) {
        ListNode nextNode = null;
        for(int i=values.length-1; i>=0; i--) {
            ListNode node = new ListNode(values[i]);
            node.next = nextNode;
            nextNode = node;
        }
        return nextNode;
    }
    public static void print(ListNode node) {
        while(node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("null");
    }
}
