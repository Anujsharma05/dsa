package linked_lists.questions;

import java.util.HashSet;

public class RemoveDups {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertNode(1);
        l.insertNode(2);
        l.insertNode(1);
        l.insertNode(3);

        l.traverseLinkedList();

        RemoveDups obj = new RemoveDups();

//      obj.deleteDups(l);
        obj.deleteDupsWithSet(l);

        l.traverseLinkedList();
    }

    public void deleteDups(LinkedList list) {
        if(list.head == null) return;

        Node temp = list.head;
        Node temp1 = list.head.next;

        while(temp != null) {
            Node temp2 = temp;
            while(temp1 != null) {
                if(temp.value == temp1.value) {
                    temp2.next = temp1.next;
                    list.size--;
                } else {
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;

            }
            temp = temp.next;
            if(temp != null) {
                temp1 = temp.next;
            }
        }
    }

    public void deleteDupsWithSet(LinkedList list) {
        if(list.head == null) return;

        Node ptr = list.head;
        HashSet<Integer> set = new HashSet<>();
        set.add(ptr.value);
        while(ptr.next != null) {
            if(set.contains(ptr.next.value)){
                ptr.next = ptr.next.next;
                list.size--;
            } else {
                set.add(ptr.next.value);
                ptr = ptr.next;
            }
        }
    }
}
