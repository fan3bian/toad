package designpattern.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {


    public static void main(String[] args) {
        //具体对象
        Subject subject = new ConcreteSubject();
        //调用处理器
        InvocationHandler invocationHandler = (proxy, method, args12) -> {
            System.out.println("pre invoke");//前环绕
            Object invoke = method.invoke(subject, args12);
            System.out.println("post invoke");//后环绕
            return invoke;
        };
        //代理对象
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class<?>[]{Subject.class}, invocationHandler);
        //执行方法
        System.out.println(proxyInstance.getClass());//class designpattern.$Proxy0
        proxyInstance.request();
    }

    @Test
    public void testJDKProxy() {
        Subject subject = new ConcreteSubject();
        Subject jdkProxy = (Subject) ProxyFactory.getJDKProxy(subject);
        jdkProxy.request();
    }
    @Test
    public void testCglibProxy() {
        Subject subject = new ConcreteSubject();
        Subject cglibProxy = (Subject) ProxyFactory.getCglibProxy(subject);
        cglibProxy.request();
    }


}
