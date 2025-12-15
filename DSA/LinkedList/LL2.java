
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

    public void insertAtLast(int value) {
        Node newnode = new Node(value);
        if (tail == null) {
            insertFirst(value);
            return;
        }

        tail.next = newnode;
        tail = newnode;
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

public class LL2 {

    LL list = new LL();

    public static void main(String[] args) {
        LL2 ll2 = new LL2();
        ll2.list.insertAtLast(10);
        ll2.list.insertAtLast(20);
        ll2.list.insertAtLast(30);
        ll2.list.display();
    }
}
