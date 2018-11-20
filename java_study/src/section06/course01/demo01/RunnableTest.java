package section06.course01.demo01;

public class RunnableTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
              Runnable myRunnable = new MyRunnable();

              Thread thread1 = new Thread(myRunnable);
              Thread thread2 = new Thread(myRunnable);

              thread1.start();
              thread2.start();
            }
        }
    }
}
