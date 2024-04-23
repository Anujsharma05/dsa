package linked_lists.community_classroom.doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addFirst(8);
        dll.addLast(2);
        dll.addLast(5);
        dll.addLast(7);
        dll.print();
        int deleted = dll.deleteFirst();
        System.out.println(deleted);
        dll.print();
    }
}
