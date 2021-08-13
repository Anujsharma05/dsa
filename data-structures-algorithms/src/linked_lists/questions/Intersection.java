package linked_lists.questions;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertNode(3);
        list1.insertNode(1);
        list1.insertNode(5);
        list1.insertNode(9);

        LinkedList list2 = new LinkedList();
        list2.insertNode(2);
        list2.insertNode(4);
        list2.insertNode(6);

        Intersection obj = new Intersection();

        obj.addSameNode(list1, list2, 7);
        obj.addSameNode(list1, list2, 2);
        obj.addSameNode(list1, list2, 1);

        Node inter = obj.findIntersection(list1, list2);
        System.out.println(inter.value);

        Node i = obj.findInter(list1, list2);
        System.out.println(i.value);
    }

    public void addSameNode(LinkedList list1, LinkedList list2, int val) {
        Node node = new Node();
        node.value = val;
        node.next = null;
        list1.tail.next = node;
        list1.tail = node;
        list2.tail.next = node;
        list2.tail = node;
    }

    public Node findIntersection(LinkedList list1, LinkedList list2) {

        Set<Node> set = new HashSet<>();

        Node temp1 = list1.head;
        Node temp2 = list2.head;

        while(temp1!=null || temp2!=null) {
            if(temp1 != null) {
                if(set.add(temp1)) {
                    temp1 = temp1.next;
                } else {
                    return temp1;
                }
            }
            if(temp2 != null) {
                if(set.add(temp2)){
                    temp2 = temp2.next;
                } else {
                    return temp2;
                }
            }
        }
        return null;
    }

    public Node findInter(LinkedList list1, LinkedList list2) {

        //list do not end in common nodes
        if(list1.tail != list2.tail) {
            return null;
        }

        Node longPtr;
        Node shortPtr;
        int skipsteps;
        if(list1.size >= list2.size) {
            longPtr = list1.head;
            shortPtr = list2.head;
            skipsteps = list1.size - list2.size;
        } else {
            longPtr = list2.head;
            shortPtr = list1.head;
            skipsteps = list2.size - list1.size;
        }
        int pos = 0;
        while(pos < skipsteps) {
            longPtr = longPtr.next;
            pos++;
        }

        while(shortPtr!=null && longPtr!=null) {
            if(shortPtr == longPtr) {
                return shortPtr;
            }

            shortPtr = shortPtr.next;
            longPtr = longPtr.next;
        }

        return null;
    }
}
