package AQS;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Thread(()->{
            String A = "数据A";
            try {
                exchanger.exchange(A);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                String B = "数据B";
                String A = exchanger.exchange("");
                System.out.println("A的值是:"+A);
                System.out.println("B的值是:"+B);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
