class circular {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int rear = 0;
    private int size = 0;

    public circular() {
        this(DEFAULT_SIZE);
    }

    public circular(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        data[rear] = item;
        rear = (rear + 1) % data.length;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = data[front];
        front = (front + 1) % data.length;
        size--;
        return removed;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i = (i + 1) % data.length;
        } while (i != rear);
        System.out.println("END");
    }
}


public class CircularQueue {
     public static void main(String[] args) {

        circular cq = new circular(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();

        System.out.println("Dequeued: " + cq.dequeue());
        cq.display();

        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();
    }
}
