
class SleepExample extends Thread {

    public void run() {
        System.out.println("Thread started");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Count: " + i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Loop finished");
    }
}

public class Test1 {

    public static void main(String[] args) {
        SleepExample t1 = new SleepExample();
        t1.start();
    }
}
