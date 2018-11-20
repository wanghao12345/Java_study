package section06.course01.demo01;

public class ThreadTest {
    public static void main(String[] args) {
        for ( int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Runnable myRunnable = new MyRunnable();

                Thread thread = new MyThread(myRunnable);
                thread.start();
            }
        }
    }
}
