package ReentrantLockTest;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Product implements Runnable {
    private List list;
    private Lock lock;
    private Condition condition;
    private int num = 0;
    private int count;

    public Product(List list, Lock lock, Condition condition , int count) {
        this.list = list;
        this.lock = lock;
        this.condition = condition;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            // 锁
            lock.lock();
            while (num<count) {
                Random r = new Random();
                // 如果list长度大于0，则停止生产，即开始等待
                while (list.size() > 0) {
                    condition.await();
                }
                // 模拟生产时间
                Thread.sleep(100);
                // add一个随机数
                list.add(r.nextInt(100));
                System.out.println(Thread.currentThread().getName() + (num+1)+"线程生产了" + list.get(0));
                // 通知其他线程
                num++;
                condition.signalAll();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            // 释放锁
            lock.unlock();
        }
    }
}
