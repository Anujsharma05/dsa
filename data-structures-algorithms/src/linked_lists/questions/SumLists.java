package linked_lists.questions;

public class SumLists {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertNode(7);
        list1.insertNode(1);
        list1.insertNode(6);

        LinkedList list2 = new LinkedList();
        list2.insertNode(5);
        list2.insertNode(9);
        list2.insertNode(2);

        SumLists obj = new SumLists();

        LinkedList sum = obj.listsSum(list1, list2);
        sum.traverseLinkedList();
    }

    public LinkedList listsSum(LinkedList list1, LinkedList list2) {
        Node temp1 = list1.head;
        Node temp2 = list2.head;

        list1.tail = list1.head;
        int carry = 0;
        while(temp1 != null && temp2 != null) {
            Node next1 = temp1.next;

            int digitSum = temp1.value + temp2.value + carry;

            if(digitSum < 10) {
                temp1.value = digitSum;
                carry = 0;
            } else {
                temp1.value = digitSum%10;
                carry = digitSum/10;
            }

            if(temp1.next == null && carry != 0) {
                Node node = new Node();
                node.value = carry;
                node.next = null;
                temp1.next = node;
                temp1 = node;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return list1;
    }
}
