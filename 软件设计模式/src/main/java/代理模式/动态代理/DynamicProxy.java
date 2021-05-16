package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    //InvocationHandler接口的方法，proxy表示代理，method表示原对象被调用的方法，args表示方法的参数
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("老师开始整活了");
        method.invoke(object,args);
        System.out.println("告辞");
        return null;
    }

}
