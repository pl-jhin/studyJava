package Java并发程序设计.线程中断;
/**
 * @ Description   :  线程中断需要处理
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-24 19:13
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println("线程运行");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("线程中断了");
                if (Thread.currentThread().isInterrupted()){
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread2());
        thread.start();
        try {
            Thread.sleep(500);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
