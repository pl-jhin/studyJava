package Java并发程序设计.线程中断;
/**
 * @ Description   :  普通中断线程
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-24 19:13
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while (true){
            if (Thread.currentThread().isInterrupted()){
                System.out.println("线程中断了");
                break;
            }
            System.out.println("持续输出");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
        try {
            Thread.sleep(500);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
