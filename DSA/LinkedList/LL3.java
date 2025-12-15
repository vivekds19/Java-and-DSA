
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

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;

        }

        size--;
        return value;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
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
        System.out.println(ll3.list.deleteFirst());
        ll3.list.display();
        System.out.println(ll3.list.deleteLast());
        ll3.list.display();
        System.out.println(ll3.list.deleteAtIndex(1));
        ll3.list.display();
    }
}
