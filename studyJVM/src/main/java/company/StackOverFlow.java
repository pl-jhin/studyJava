package company;

/**
 * 栈溢出情况  单线程
 * 原因是线程请求栈深度大于虚拟机所允许的最大深度
 * 基本数据类型 方法入口 方法出口 动态链接 class文件有关的
 */
public class StackOverFlow {
    private static   int i = 1;
    private static void stackLeak(){
        i++;
        stackLeak();
    }
    public static void main(String[] args) {
        try {
            stackLeak();
        }catch (Throwable e){
            System.out.println("i=="+i);
            e.printStackTrace();
        }
    }
}
