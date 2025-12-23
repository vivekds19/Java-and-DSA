
class QueueArray {

    int size = 5;
    int[] q = new int[size];
    int front = 0, rear = -1;

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        q[++rear] = x;
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Deleted: " + q[front++]);
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
