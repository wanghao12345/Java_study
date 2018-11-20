package section06.course01.demo01;

public class MyRunnable implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        System.out.println("in MyRunnable run....");
        for (i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
