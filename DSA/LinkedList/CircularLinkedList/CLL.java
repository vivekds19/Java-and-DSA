
public class CLL {

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node head = null;
    private Node tail = null;

    public void addFirst(int value) {
        Node newnode = new Node(value);
        if (head == null) {
            head = tail = newnode;
            tail.next = head;
        }
        newnode.next = head;
        head = newnode;
        tail.next = head;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.display();
    }
}
