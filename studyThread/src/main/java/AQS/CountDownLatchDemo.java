package AQS;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(5);

        new Thread(()->{
            // 摇人整活
            System.out.println("赶紧摇人来整活");
            try {
                // 憨憨等人上号
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 开始游戏
            System.out.println("发车！！！！！");
        }).start();

        for (int i = 0; i < 5 ; i++) {
            new Thread(()->{
                // 憨憨上号中。。。
                System.out.println(Thread.currentThread().getName()+"正在上号");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 憨憨上号成功 count - 1
                System.out.println(Thread.currentThread().getName()+"已上号，等待发车");
                latch.countDown();
            },"第"+(i+1)+"个人").start();
        }
    }
}
