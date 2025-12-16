
class MyTask implements Runnable {

    public void run() {
        System.out.println("Thread running using Runnable");
    }
}

public class Demo {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t1 = new Thread(task);
        t1.start();
    }
}
