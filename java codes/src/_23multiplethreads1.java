class ThreadA extends Thread {
    public void run() {
        for(int i = 1; i<=5; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for(int i = 1; i<=5; i++) {
            System.out.println("Thread B: " + i);
        }
    }
}

public class _23multiplethreads1 {
    public static void main (String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        try {
            a.start();
            a.join();

            b.start();
            b.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Threads finished/ended...");
    }
}
