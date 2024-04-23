package linked_lists.community_classroom.singly_linked_list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.add(1,2,3,4,5);
        int deleted = list.remove(2);
        System.out.println(deleted);
        list.print();
        list.size();
        LinkedList<Integer> l = new LinkedList<>();

        System.out.println("==================");

        list.clear();

        list.add(3,5,9,1);
        list.print();
        list.addRecursive(0, 7);
        list.print();
    }
}
