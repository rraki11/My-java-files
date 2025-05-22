public class _22thread2 implements Runnable{
    private int n;

    public _22thread2 (int num) {
        n = num;
    }

    public void run() {
        System.out.println("Thread number " + n + " is running");
    }

    public static void main(String[] args) {
        _22thread2 rr1 = new _22thread2(1);
        _22thread2 rr2 = new _22thread2(2);
        _22thread2 rr3 = new _22thread2(3);

        Thread t1 = new Thread(rr1);
        Thread t2 = new Thread(rr2);
        Thread t3 = new Thread(rr3);

        try{
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nThreads implemented by Runnable class are being ended..");
    }
}
