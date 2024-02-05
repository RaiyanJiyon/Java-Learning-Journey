// Runnable class representing a thread that prints "12345678" and "I am Happy."
class MyRunnableThread1 implements Runnable {
    int i = 0;

    @Override
    public void run() {
        while (i < 100) {
            System.out.println("12345678");
            System.out.println("I am Happy.");
            i++;
        }
    }
}

// Runnable class representing a thread that prints "ABCDEFGHI" and "I am Sad."
class MyRunnableThread2 implements Runnable {
    int i = 0;
    
    @Override
    public void run() {
        while (i < 100) {
            System.out.println("ABCDEFGHI");
            System.out.println("I am Sad.");
            i++;
        }
    }
}

// Main class to test the two runnable threads
public class Test {
    public static void main(String[] args) {
        // Creating instances of the two runnable threads
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        MyRunnableThread2 bullet2 = new MyRunnableThread2();

        // Creating threads and associating them with the respective runnable threads
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        // Starting the threads
        gun1.start();
        gun2.start();
    }
}
