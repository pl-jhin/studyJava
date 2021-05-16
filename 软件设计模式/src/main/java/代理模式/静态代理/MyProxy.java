package 代理模式.静态代理;

public class MyProxy {
    public static void main(String[] args) {
        Proxy proxy = new Proxy("彭雷");
        proxy.doSomething();
    }
}
