package problems.leetcode.medium.partionlinkedlist;

public class Partition {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertNode(9);
        l.insertNode(7);
        l.insertNode(5);
        l.insertNode(3);
        l.insertNode(1);

        l.traverseLinkedList();

        Partition obj = new Partition();

        int x = 5;
//        obj.partitionLinkedList(l.head, x);
        System.out.println(l.head);
        l.head = obj.partition(l.head, x);
        l.traverseLinkedList();
    }

//    O(n^2) time O(1) space
    public void partitionLinkedList(Node head, int x) {
        if(head == null) return;

        Node trailingPtr = head;
        Node targetPtr = head;

        while(targetPtr !=null) {
            while(trailingPtr != null && trailingPtr.value < x) {
                trailingPtr = trailingPtr.next;
                targetPtr = targetPtr.next;
            }

            while(targetPtr != null && targetPtr.value >= x) {
                targetPtr = targetPtr.next;
            }

            if(targetPtr == null) {
                break;
            }
            Node tPtr = trailingPtr;
            int tempVal = tPtr.value;
            int nextVal = tPtr.value;
            while(tPtr != targetPtr) {
                nextVal = tPtr.next.value;
                tPtr.next.value = tempVal;
                tempVal = nextVal;
                tPtr = tPtr.next;
            }

            trailingPtr.value = nextVal;
            trailingPtr = trailingPtr.next;
            targetPtr = trailingPtr;
        }
    }

//   O(n) time O(1) space
    public Node partition(Node head , int x) {

        if(head == null) return null;

        Node left = new Node();
        Node right = new Node();

        Node ptrLeft = left;
        Node ptrRight = right;

        Node temp = head;

        while(temp != null) {
            if(temp.value < x) {
                ptrLeft.next = temp;
                ptrLeft = ptrLeft.next;
            } else {
                ptrRight.next = temp;
                ptrRight = ptrRight.next;
            }
            temp = temp.next;
        }

        ptrLeft.next = right.next;
        ptrRight.next = null;
        return left.next;
    }
public Node partition(Node head, int x, int z) {
    if(head==null) return null;


    Node left=new Node(0);
    Node right=new Node(0);

    Node tail1=left , tail2=right;

    Node iterator=head;
    while(iterator!=null){
        if(iterator.value<x){
            tail1.next=iterator;
            tail1=tail1.next;
        }else{
            tail2.next=iterator;
            tail2=tail2.next;
        }
        iterator=iterator.next;
    }
    tail1.next=right.next;
    tail2.next=null; // important

    return left.next;
}
}
