package linked_lists.community_classroom.singly_linked_list;

public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        System.out.println("Size: " + size);
        return size;
    }

    public void add(int value) {
       addLast(value);
    }

    public void add(int ...values) {
        for(int i: values) {
            add(i);
        }
    }

    public void add(int index, int value) throws IndexOutOfBoundsException {
        if(index > size) {
            throw new IndexOutOfBoundsException("size: " + size);
        }
        if(index == 0) {
            addFirst(value);
        } else if(index == size) {
            addLast(value);
        } else {
            addIntermediate(index, value);
        }
    }
    public void addFirst(int value) {
        Node node = new Node(value, head);
        head = node;

        if(tail == null) {
            tail = node;
        }
        size++;
    }
    public void addLast(int value) {
        if(size == 0) {
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    private void addIntermediate(int index, int value) {
        Node node = head;
        /**
         * Reaching node one index behind the target index
         */
        for(int i=1; i<index; i++) {
            node = node.next;
        }
        Node temp = new Node(value, node.next);
        node.next = temp;
        size++;
    }

    public int get(int index) throws IndexOutOfBoundsException {
        Node node = getNode(index);
        return node.value;
    }

    public Node getNode(int index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException("size: " + size);
        }
        Node node = head;
        for(int i=0; i<index; i++) {
            node = node.next;
        }
        return node;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(int value) {
        Node node = head;
        for(int i=0; i<size; i++) {
            if(node.value == value) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int value) {
        Node node = head;
        for(int i=0; i<size; i++) {
            if(node.value == value) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        Node node = head;
        int lastIndex = -1;
        for(int i=0; i<size; i++) {
            if(node.value == value) {
                lastIndex = i;
            }
            node = node.next;
        }
        return lastIndex;
    }

    public void remove() {
        removeLast();
    }
    public int remove(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("size: " + size);
        }
        int val;
        if(index == 0) {
            val = removeFirst();
        } else if(index == size-1) {
            val = removeLast();
        } else {
            val = removeIntermediate(index);
        }
        return val;
    }
    public int removeFirst() {
        if(size == 0) {
            throw new IndexOutOfBoundsException("size: " + size);
        }
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int removeLast() {

        if(size == 0 || size == 1) {
            return removeFirst();
        }

        int val = tail.value;
        Node secondLast = getNode(size-2);

        secondLast.next = null;
        tail = secondLast;
        size--;

        return val;
    }

    private int removeIntermediate(int index) {

        Node prevNode = getNode(index-1);
        Node curNode = prevNode.next;

        prevNode.next = curNode.next;
//        curNode.next = null;
        size--;
        return curNode.value;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        System.out.println("head:" + head + ", tail:" + tail + ", size:" + size);
    }

    public void printRecursive() {
        printRecursiveHelper(head);
        System.out.println();
    }

    private void printRecursiveHelper(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node + "->");
        printRecursiveHelper(node.next);
    }

    /**
     * Insert in LL using Recursion
     */
    public void addRecursive(int index, int value) {
        Node headNode = addRecursive(index, value, head);
        //update the head
        head = headNode;
    }
    private Node addRecursive(int index, int value, Node curNode) {
        if(index == 0) {
            Node node = new Node(value, curNode);
            size++;
            return node;
        }
        Node nextNode = addRecursive(index-1, value, curNode.next);
        curNode.next = nextNode;
        return curNode;
    }

    public void bubbleSort() {
        bubbleSort(size-1, 0);
    }
    private void bubbleSort(int r, int c) {
        if(r == 0) return;

        if(c < r) {
            Node first = getNode(c);
            Node second = getNode(c+1);
            if(first.value > second.value) {
                //swap
                if(first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }else if(second == tail) {
                    Node prev = getNode(c-1);
                    prev.next = second;
                    second.next = first;
                    first.next = null;
                    tail = first;
                } else {
                    Node prev = getNode(c-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(r, c+1);
        } else {
            bubbleSort(r-1, 0);
        }
    }

    public void reverse() {
        if(head == null) return;
        Node lastNode = reverse(head);
        lastNode.next = null;
        tail = lastNode;
    }

    /**
     * My approach: If tail variable is not there
     */
    private Node reverse(Node node) {
        if(node.next == null) {
            head = node;
            return node;
        }
        Node nextNode = reverse(node.next);
        nextNode.next = node;
        return node;
    }
    public void reverseUsingTail(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }
        reverseUsingTail(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverseIterativeInPlace() {
        if(head == null) {
            return;
        }
        Node prev = null;
        Node cur = head;
        Node next = head.next;
        tail = head;
        while(cur != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next == null ? null : next.next;
        }
        head = prev;
    }


}
