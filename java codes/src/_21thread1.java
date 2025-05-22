public class _21thread1 extends Thread {
    private int n;

    // Constructor to initialize thread number
    public _21thread1(int num) {
        n = num;
    }

    // This method runs when the thread starts
    public void run() {
        System.out.println("Thread number " + n + " is running");
    }

    public static void main(String[] args) {

        // Creating thread objects
        _21thread1 t1 = new _21thread1(1);
        _21thread1 t2 = new _21thread1(2);
        _21thread1 t3 = new _21thread1(3);

        // rr1.setPriority(MAX_PRIORITY);  //priority = 10
        // rr2.setPriority(NORM_PRIORITY); //priority = 5
        // rr3.setPriority(MIN_PRIORITY);  //priority = 1

        // Starting threads
        // t1.start();
        // t2.start();
        // t3.start();

        // Ensuring the main thread waits for these threads to finish (that's why we used "join") and run in a sequence (that's why we used "start" before "join" to run in a sequence)
        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            // System.out.println("Thread interrupted");
            e.printStackTrace();
        }

        System.out.println("\nThreads extended by Thread class are being ended..");
    }
}
