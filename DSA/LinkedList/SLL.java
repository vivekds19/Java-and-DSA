
class LL {

    private Node head;
    private Node tail;

    // Node class
    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
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
    }

    public void insertAtLast(int value) {
        Node newnode = new Node(value);
        if (tail == null) {
            insertFirst(value);
            return;
        }

        tail.next = newnode;
        tail = newnode;

    }

    public void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        tail = current;
        tail.next = null;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class SLL {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertFirst(10);
        list.insertAtLast(30);
        list.insertAtLast(30);
        list.display();
        list.removeDuplicates();
        list.display();
    }
}
