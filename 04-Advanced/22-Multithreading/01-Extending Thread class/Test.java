// Thread class representing a thread that prints "12345" and "I am Happy."
class MyThread1 extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 100) {
            System.out.println("12345");
            System.out.println("I am Happy.");
            i++;
        }
    }
}

// Thread class representing a thread that prints "ABCDE" and "I am Sad"
class MyThread2 extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 100) {
            System.out.println("ABCDE");
            System.out.println("I am Sad");
            i++;
        }
    }
}

// Main class to test the two threads
public class Test {
    public static void main(String[] args) {
        // Creating and starting the first thread (MyThread1)
        MyThread1 t1 = new MyThread1();
        t1.start();

        // Creating and starting the second thread (MyThread2)
        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}
