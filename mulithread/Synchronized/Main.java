
class Counter {

    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class Test extends Thread {

    Counter c;

    Test(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }

}

public class Main {

    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        Test t1 = new Test(c);
        Test t2 = new Test(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count); 
    }
}
