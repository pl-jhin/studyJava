package company;

/**
 * 栈溢出 多线程的情况
 * 原因是线程请求栈深度大于虚拟机所允许的最大深度
 */
public class StackOverFlow2 {
    private static void dontStop(){
        while (true){
        }
    }
    private static void stackByThread(){
        while (true){
            Thread thread =new Thread(()->dontStop());
            thread.start();
        }
    }
    public static void main(String[] args) {
        stackByThread();
    }
}
