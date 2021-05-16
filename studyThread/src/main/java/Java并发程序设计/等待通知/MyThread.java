package Java并发程序设计.等待通知;

public class MyThread {
    static Object object = new Object();
    static class Thread1 extends Thread{
        @Override
        public void run() {
            synchronized (object){
                try {
                    object.notify();
                    System.out.println("Thread1线程运行并通知");
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (object){
                try {
                    System.out.println("Thread2等待");
                    object.wait();
                    System.out.println("Thread2线程运行");
                    object.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t2.start();
        t1.start();

    }
}
