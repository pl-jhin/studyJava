package AQS;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        // 发车线程
        Thread play =new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"发车发车");
        });

        CyclicBarrier barrier = new CyclicBarrier(5,play);

        for (int i = 0; i < 5 ; i++) {
            new Thread(()->{
                // 憨憨上号中。。。
                System.out.println(Thread.currentThread().getName()+"正在上号");
                try {
                    // 模拟憨憨上号时间
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 憨憨上号成功 count - 1
                System.out.println(Thread.currentThread().getName()+"已上号，等待发车");
                try {
                    barrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            },"第"+(i+1)+"个人").start();
        }
    }
}
