package ReentrantLockTest;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        int num =20;
        CountDownLatch downLatch = new CountDownLatch(num);
        Lock lock = new ReentrantLock();
        List list = new CopyOnWriteArrayList<Integer>();
        Condition condition = lock.newCondition();

        Consumer consumer = new Consumer(list, lock, condition,downLatch);
        Product product = new Product(list, lock, condition,num);
        Thread thread =new Thread(()->{
            try {
                downLatch.await();
                System.out.println("最后值为："+consumer.getNum());
            } catch (InterruptedException e) {

            }
        });
        thread.start();
        try {
            lock.lock();
            new Thread(product,"product").start();
            new Thread(consumer,"consumer").start();
        }finally {
            lock.unlock();
        }

    }
}
