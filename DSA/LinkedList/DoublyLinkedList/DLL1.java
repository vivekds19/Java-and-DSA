
class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public class Node {

        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value) {
        Node newnode = new Node(value);
        newnode.next = head;
        newnode.prev = null;

        if (head != null) {
            head.prev = newnode;
        } else {
            // list was empty
            tail = newnode;
        }

        head = newnode;
        size++;
    }

    public void insertLast(int value) {
        Node newnode = new Node(value);
        if (tail == null) {
            insertFirst(value);
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class DLL1 {

    public static void main(String[] args) {

        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.display();
        list.insertLast(40);
        list.display();
    }
}
