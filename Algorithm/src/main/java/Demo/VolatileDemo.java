package Demo;


import java.util.concurrent.atomic.AtomicInteger;

public class VolatileDemo {
    static AtomicInteger i = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k <1000 ; k++) {
                new Thread(()->{
                    System.out.println(Thread.currentThread().getName()+"---"+(i.incrementAndGet()));
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        }
    }
}

