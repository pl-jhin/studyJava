package Java并发程序设计.终止线程;

public class ChangeObjectThread extends Thread {
    volatile boolean flag = false;
    volatile int i = 0;

    Object object = new Object();
    public void stopThread(){
        flag=true;
    }
    @Override
    public void run() {
        while (true){
            if (flag){
                System.out.println(Thread.currentThread().getName()+"线程停止");
                break;
            }
            synchronized (object){
                System.out.println(Thread.currentThread().getName()+"此时i="+i);
                if (i==15)stopThread();
                i++;
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new ChangeObjectThread(),"一号线程").start();
        new Thread(new ChangeObjectThread(),"二号线程").start();

    }

}
