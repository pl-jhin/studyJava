package AQS;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        // 模拟五个停车位
        Semaphore semaphore = new Semaphore(5);
        // 模拟十辆车
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                try {
                    // 模拟停车时间
                    long time = (long) (Math.random()*1000);
                    // 获得停车位
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "进入停车，停车时间为" + time);
                    Thread.sleep(time);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"离开车位");
                // 离开停车位
                semaphore.release();
            },"T"+i).start();
        }
    }
}
