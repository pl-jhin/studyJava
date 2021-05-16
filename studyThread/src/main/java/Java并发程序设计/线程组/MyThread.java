package Java并发程序设计.线程组;

public class MyThread implements Runnable {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("线程组");
        Thread t1 = new Thread(group,new MyThread(),"t1");
        Thread t2 = new Thread(group,new MyThread(),"t2");
        t1.start();
        t2.start();
        group.list();
    }
    @Override
    public void run() {
        System.out.println("当前线程为"+Thread.currentThread().getName());
    }
}
