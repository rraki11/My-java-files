class ThreadA implements Runnable {
    public void run() {
        for(int i = 1; i<=5; i++) {
            try{
                Thread.sleep(1000);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Thread A: " + i);
        }
    }
}

class ThreadB implements Runnable {
    public void run() {
        for(int i = 1; i<=5; i++) {
            try{
                Thread.sleep(2000);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Thread B: " + i);
        }
    }
}

class ThreadC implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Thread C: " + i);
        }
    }
}

public class _24multiplethreads2 {
    public static void main (String[] args) {

        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();

        Thread A = new Thread(a);
        Thread B = new Thread(b);
        Thread C = new Thread(c);

        //try {
            A.start();
            //A.join();

            B.start();
            //B.join();

            C.start();
            //C.join();
        //}
        //catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

        System.out.println("All threads ended...");

    }
}
