package ReentrantLockTest;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {
    private List list;
    private Lock lock;
    private Condition condition;
    private CountDownLatch countDownLatch;
    private int num = 0;
    public int getNum() {
        return num;
    }
    public Consumer(List list, Lock lock, Condition condition , CountDownLatch countDownLatch) {
        this.list = list;
        this.lock = lock;
        this.condition=condition;
        this.countDownLatch=countDownLatch;
    }
    @Override
    public void run() {
        try {
            // 锁
            lock.lock();
            while (true) {
                // 如果list长度小于等于0，则等待通知方通知
                while (list.size() <= 0) {
                    // 等待
                    condition.await();
                }
                // 模拟消费时间
                Thread.sleep(100);
                // 输出
                num=num+(int)list.get(0);
                System.err.println("当前结果为:"+num);
                countDownLatch.countDown();
                list.remove(0);
                // 通知 通知方继续生产
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
