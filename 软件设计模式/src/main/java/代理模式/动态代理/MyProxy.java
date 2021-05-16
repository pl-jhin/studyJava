package 代理模式.动态代理;

import java.lang.reflect.Proxy;

public class MyProxy {
    public static void main(String[] args) {
        //实例化目标对象
        GoodStudent student = new GoodStudent("学委");
        //BadStudent student = new BadStudent("彭雷");
        //实例化调用处理类(老表)
        DynamicProxy proxy = new DynamicProxy(student);
        //准备一个类加载器
        ClassLoader classLoader = MyProxy.class.getClassLoader();
        //获取目标对象的接口类对象数组
        Class<?>[] interfaces = student.getClass().getInterfaces();
        /*第一个参数：classLoader，使用handler对象的classloader对象来加载我们的代理对象
          第二个参数：interfaces，这里为代理类提供的接口是真实对象实现的接口，这样代理对象就能像真实对象一样调用接口中的所有方法
          第三个参数：proxy，我们将代理对象关联到上面的InvocationHandler对象上
         */
        //创建代理
        People people = (People) Proxy.newProxyInstance(classLoader,interfaces,proxy);
        people.doOne();
        people.doTwo();
    }
}
