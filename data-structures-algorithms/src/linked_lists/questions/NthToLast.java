package linked_lists.questions;

public class NthToLast {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertNode(1);
        l.insertNode(2);
        l.insertNode(3);
        l.insertNode(4);
        l.insertNode(5);

        l.print();

        NthToLast obj = new NthToLast();

        obj.nthElementFromLast(l, 5);

        Node n = obj.nthElementFromLastTwoPtr(l, 1);
        System.out.println(n!=null ? n.value: null);
    }

    public void nthElementFromLast(LinkedList ll, int index) {
        if(ll == null || ll.head == null) return;
        if(index > ll.size || index < 1) return;

        int desiredIndex = ll.size - index;

        Node temp = ll.head;

        for(int i=0; i<desiredIndex; i++) {
            temp = temp.next;
        }

        System.out.println(temp.value);
    }

    public Node nthElementFromLastTwoPtr(LinkedList ll, int index) {
        if(ll == null || ll.head == null) return null;
        if(index > ll.size || index < 1) return null;

        Node ptr1 = ll.head;
        Node ptr2 = ll.head;

        for(int i=0; i<index-1; i++) {
            ptr1 = ptr1.next;
        }

        while(ptr1.next != null) {
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }

        return ptr2;
    }
}
