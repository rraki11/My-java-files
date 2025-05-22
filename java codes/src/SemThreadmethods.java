class ThreadA  extends Thread{
    public void run() {
        for (int i = 0;i<=5;i++){
            System.out.println("Thread A: " + i);
        }
        System.out.println("Thread A exit");
    }
}

class ThreadB  extends Thread{
    public void run() {
        for (int i = 0;i<=5;i++){
            System.out.println("Thread B: " + i);
        }
        System.out.println("Thread B exit");
    }
}

public class SemThreadmethods {
    public static void main (String[] args) {
        ThreadA t1 = new ThreadA();
        Thread t2 = new ThreadB();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("is t1 thread alive: " + t1.isAlive());
        System.out.println("is t2 thread alive: " +t2.isAlive());

        System.out.println("end of the threads");
    }
}
