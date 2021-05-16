package stateDemo;

public class OneDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1线程");
        });
        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2线程");
        });
        System.out.println(t1.getState());
        t1.start();
        Thread.sleep(300);
        t2.start();
        System.out.println("t1的状态："+t1.getState());
        System.out.println("t2的状态："+t2.getState());
        Thread.sleep(1000);
        System.out.println("t1的状态："+t1.getState());
        System.out.println("t2的状态："+t2.getState());

    }
}
