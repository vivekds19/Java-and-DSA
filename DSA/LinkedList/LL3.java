
class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }

    }

    public void insertFirst(int value) {
        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        Node newnode = new Node(value);
        if (tail == null) {
            insertFirst(value);
            return;
        }

        tail.next = newnode;
        tail = newnode;
        size++;
    }

    public void insertAt(int value, int index) {

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newnode = new Node(value, temp.next);
        temp.next = newnode;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class LL3 {

    LL list = new LL();

    public static void main(String[] args) {
        LL3 ll3 = new LL3();
        ll3.list.insertFirst(5);
        ll3.list.insertLast(10);
        ll3.list.insertLast(20);
        ll3.list.insertLast(30);
        ll3.list.insertAt(15, 2);
        ll3.list.display();
    }
}
