package ThreadPoolTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService e1 = Executors.newCachedThreadPool();
        ExecutorService e2 = Executors.newFixedThreadPool(10);
        ExecutorService e3 = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 100 ; i++) {
            e2.execute(new MyTest(i));
        }
        Thread.sleep(61000);
        for (int i = 101; i <= 200 ; i++) {
            e2.execute(new MyTest(i));
        }
    }
}
class MyTest implements Runnable{
    private int i = 0;

    public MyTest(int i ) {
        this.i = i;

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"----"+i);
    }
}
